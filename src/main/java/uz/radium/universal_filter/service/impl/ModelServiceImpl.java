package uz.radium.universal_filter.service.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.radium.universal_filter.entity.Model;
import uz.radium.universal_filter.entity.ModelForm;
import uz.radium.universal_filter.entity.ModelResponse;
import uz.radium.universal_filter.repository.ModelRepo;
import uz.radium.universal_filter.service.ModelService;

import java.util.List;
import java.util.Optional;

@Service
public class ModelServiceImpl implements ModelService {

    private final ModelRepo repo;

    public ModelServiceImpl(ModelRepo repo) {
        this.repo = repo;
    }

    public List<Model> getModelList() {
        return repo.findAllByTrashIsFalseOrderByIdDesc();
    }

    public Optional<Model> getModel(Long id) {
        return repo.findByIdAndTrashIsFalse(id);
    }

    public Optional<Model> getModel(String name) {
        return repo.findByNameAndTrashIsFalse(name);
    }

    public Boolean existModel(Long id) {
        return repo.existsByIdAndTrashIsFalse(id);
    }

    public Boolean existModel(String name) {
        return repo.existsByNameAndTrashIsFalse(name);
    }

    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(getModelList());
    }

    public ResponseEntity<?> findById(Long id) {
        Optional<Model> modelOptional = getModel(id);
        if (modelOptional.isPresent()) {
            try {

                ModelResponse response = new ModelResponse();
                response.setId(modelOptional.get().getId());
                response.setName(modelOptional.get().getName());

                return ResponseEntity.ok("SUCCESS");
            } catch (Exception exception){
                return ResponseEntity.badRequest().build();
            }
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<?> add(ModelForm form) {
        if (existModel(form.getName())) {
            return ResponseEntity.badRequest().build();
        } else {
            try {
                Model model = new Model();
                model.setName(form.getName());
                repo.save(model);

                ModelResponse response = new ModelResponse();
                response.setId(model.getId());
                response.setName(model.getName());

                return ResponseEntity.ok(response);
            } catch (Exception exception) {
                return ResponseEntity.badRequest().build();
            }
        }
    }

    public ResponseEntity<?> edit(Long id, ModelForm form) {
        Optional<Model> modelOptional = getModel(id);
        if (modelOptional.isPresent()) {
            try {
                Model model = modelOptional.get();
                model.setName(form.getName());
                repo.save(model);

                ModelResponse response = new ModelResponse();
                response.setId(modelOptional.get().getId());
                response.setName(modelOptional.get().getName());

                return ResponseEntity.ok(response);
            } catch (Exception exception){
                return ResponseEntity.badRequest().build();
            }
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<?> delete(Long id) {
        Optional<Model> modelOptional = getModel(id);
        if (modelOptional.isPresent()) {
            try {
                modelOptional.get().setTrash(true);
                repo.save(modelOptional.get());
                return ResponseEntity.ok("SUCCESS");
            } catch (Exception exception){
                return ResponseEntity.badRequest().build();
            }
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

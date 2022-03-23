package uz.radium.universal_filter.service;

import org.springframework.http.ResponseEntity;
import uz.radium.universal_filter.entity.Model;
import uz.radium.universal_filter.entity.ModelForm;

import java.util.List;

public interface ModelService {
    List<Model> getModelList();
    ResponseEntity<?> findAll();
    ResponseEntity<?> findById(Long id);
    ResponseEntity<?> add(ModelForm form);
    ResponseEntity<?> edit(Long id, ModelForm form);
    ResponseEntity<?> delete(Long id);
}

package uz.radium.universal_filter.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.radium.universal_filter.entity.ModelForm;
import uz.radium.universal_filter.service.ModelService;

@RestController
@RequestMapping(path = "api/v1/")
public class ModelController {

    private final ModelService service;

    public ModelController(ModelService service) {
        this.service = service;
    }

    @GetMapping("/model/list")
    public ResponseEntity<?> findAll() {
        return service.findAll();
    }

    @PostMapping("/model")
    public ResponseEntity<?> add(@RequestBody ModelForm form) {
        return service.add(form);
    }

    @PutMapping("/model/{id}")
    public ResponseEntity<?> edit(@PathVariable Long id, @RequestBody ModelForm form) {
        return service.edit(id, form);
    }

    @DeleteMapping("/model/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        return service.delete(id);
    }
}

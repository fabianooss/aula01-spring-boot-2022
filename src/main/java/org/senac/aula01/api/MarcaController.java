package org.senac.aula01.api;

import org.senac.aula01.model.Marca;
import org.senac.aula01.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/marca")
public class MarcaController {

    @Autowired
    private MarcaRepository repository;


    @GetMapping
    public List<Marca> getAll() {

        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity get(
            @PathVariable("id") Long id) {
        Optional<Marca> marca = repository.findById(id);
        if (marca.isPresent()) {
            return ResponseEntity.ok(marca.get());
        }
        return ResponseEntity.badRequest().body("Id not found");
    }

    @PostMapping
    public void save(@RequestBody Marca marca) {
        repository.save(marca);
    }

    @PutMapping("/{id}")
    public ResponseEntity update(@RequestBody Marca marca,
                       @PathVariable Long id) {
        repository.save(marca);

        return ResponseEntity.ok(marca);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        repository.deleteById(id);
        return ResponseEntity.ok().build();
    }

}

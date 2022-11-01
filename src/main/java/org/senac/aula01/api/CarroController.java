package org.senac.aula01.api;

import org.senac.aula01.model.Carro;
import org.senac.aula01.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carro")
public class CarroController {

    @Autowired
    private CarroRepository repository;

    @PostMapping
    private void save(@RequestBody Carro carro) {
        if (carro.getFotos() != null) {
            carro.getFotos().stream().forEach(f -> f.setCarro(carro));
        }
        repository.save(carro);
    }

    @GetMapping
    public List<Carro> findAll() {
        return repository.findAll();
    }

}

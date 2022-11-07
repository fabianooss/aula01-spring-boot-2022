package org.senac.aula01.api;

import org.senac.aula01.model.Carro;
import org.senac.aula01.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

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
    public Page<Carro> findAll(@RequestParam int page, @RequestParam int size) {
        Pageable p = PageRequest.of(page, size);
        return repository.findAll(p);
    }

}

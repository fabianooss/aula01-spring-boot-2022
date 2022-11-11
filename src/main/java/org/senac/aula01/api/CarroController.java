package org.senac.aula01.api;

import org.senac.aula01.model.Carro;
import org.senac.aula01.repository.CarroRepository;
import org.senac.aula01.vo.QuantidadeCarrosMarca;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
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
    public Page<Carro> findAll(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "20") int size) {
        Pageable p = PageRequest.of(page, size,
                Sort.by("nome", "anoFabricacao"));
        return repository
                .findAll(p);
    }
    @GetMapping
    @RequestMapping("/quantidade-marca")
    public List<QuantidadeCarrosMarca> quantidadeMarca() {
        return repository.findQuantidadeCarroMarca();

    }

}

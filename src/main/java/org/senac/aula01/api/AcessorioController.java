package org.senac.aula01.api;

import org.senac.aula01.model.Acessorio;
import org.senac.aula01.repository.AcessorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/acessorio")
public class AcessorioController {

    @Autowired
    private AcessorioRepository repository;


    @PostMapping
    public void save(@RequestBody Acessorio acessorio) {
        repository.save(acessorio);
    }

}

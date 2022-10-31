package org.senac.aula01.api;

import org.senac.aula01.model.Cor;
import org.senac.aula01.repository.CorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cor")
public class CorController {

    @Autowired
    private CorRepository repository;

    @PostMapping
    public void save(@RequestBody Cor cor) {
        repository.save(cor);
    }
}

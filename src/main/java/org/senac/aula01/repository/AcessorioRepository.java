package org.senac.aula01.repository;

import org.senac.aula01.model.Acessorio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcessorioRepository extends JpaRepository<Acessorio, Long> {
}

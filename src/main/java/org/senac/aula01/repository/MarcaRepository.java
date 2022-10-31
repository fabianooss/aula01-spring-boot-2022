package org.senac.aula01.repository;

import org.senac.aula01.model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaRepository extends JpaRepository<Marca, Long> {

}

package org.senac.aula01.repository;

import org.senac.aula01.model.Carro;
import org.senac.aula01.vo.QuantidadeCarrosMarca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CarroRepository extends JpaRepository<Carro, Long> {

    @Query("select " +
            " new org.senac.aula01.vo.QuantidadeCarrosMarca" +
            "(c.marca.nome, count(c.id), avg(c.anoFabricacao)) " +
            "from Carro c " +
            "group by c.marca.nome")
    public List<QuantidadeCarrosMarca> findQuantidadeCarroMarca();
}

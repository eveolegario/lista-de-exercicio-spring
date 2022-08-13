package com.mycompany.agenda.repository;

import com.mycompany.agenda.model.ContatosM;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface ContatosR extends JpaRepository<ContatosM, Long> {

    ContatosM findByNome(String nome);
    List<ContatosM> findByNomeStartsWith(String nome);
}

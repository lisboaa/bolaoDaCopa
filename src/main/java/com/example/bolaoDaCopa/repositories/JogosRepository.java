package com.example.bolaoDaCopa.repositories;

import com.example.bolaoDaCopa.models.Jogos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JogosRepository extends JpaRepository<Jogos, Long> {
    List<Jogos> findJogosByEnfrentamento(String enfrentamento);

}


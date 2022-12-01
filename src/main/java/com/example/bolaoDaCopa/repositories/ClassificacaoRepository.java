package com.example.bolaoDaCopa.repositories;

import com.example.bolaoDaCopa.models.Classificacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClassificacaoRepository extends JpaRepository<Classificacao, Long> {

}

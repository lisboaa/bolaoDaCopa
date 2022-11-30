package com.bolaoDaCopa.repositories;

import com.bolaoDaCopa.models.Classificacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClassificacaoRepository extends JpaRepository<Classificacao, Long> {
    List<Classificacao> findClassificacaoById_classificacao(Long id_classificacao);
}
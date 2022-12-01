package com.example.bolaoDaCopa.services;

import com.example.bolaoDaCopa.models.Classificacao;

import java.util.List;

public interface ClassificacaoService {
    List<Classificacao> listarClassificacao();
    Classificacao editarClassificacao(Classificacao classificacao);
    Classificacao salvarClassificacao(Classificacao classificacao);
    void deletarClassificacao(Long id_classificacao);
}

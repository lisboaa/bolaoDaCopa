package com.example.bolaoDaCopa.services;

import com.example.bolaoDaCopa.models.Classificacao;

import java.util.List;

public interface ClassificacaoService {
    List<Classificacao> listar();
    Classificacao editar(Classificacao classificacao);
    Classificacao salvar(Classificacao classificacao);
    void deletar(Long id_classificacao);
}

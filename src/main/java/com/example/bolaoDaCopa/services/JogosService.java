package com.example.bolaoDaCopa.services;

import com.example.bolaoDaCopa.models.Jogos;

import java.util.List;

public interface JogosService {
    Jogos salvar(Jogos jogos) throws Exception;


    List<Jogos> listar();


    Jogos editar(Jogos jogos);

    void deletar(Long id_jogos);
}

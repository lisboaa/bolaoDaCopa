package com.example.bolaoDaCopa.services;

import com.example.bolaoDaCopa.models.Jogos;

import java.util.List;

public interface JogosService {
    List<Jogos> listarJogos();
    Jogos editarJogos(Jogos jogos);
    Jogos salvarJogos(Jogos jogos);
    void deletarJogos(Long id_jogos);
}

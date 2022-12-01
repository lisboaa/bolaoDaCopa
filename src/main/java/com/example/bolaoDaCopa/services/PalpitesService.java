package com.example.bolaoDaCopa.services;

import com.example.bolaoDaCopa.models.Palpites;

import java.util.List;

public interface PalpitesService {
    List<Palpites>listarPalpites();
    Palpites editarPalpites(Palpites palpites);
    Palpites salvarPalpites(Palpites palpites);
    void deletarPalpites(Long id_palpites);
}

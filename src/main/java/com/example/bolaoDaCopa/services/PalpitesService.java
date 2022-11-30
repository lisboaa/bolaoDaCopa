package com.example.bolaoDaCopa.services;

import com.example.bolaoDaCopa.models.Palpites;

import java.util.List;

public interface PalpitesService {

    Palpites salvar(Palpites palpites) throws Exception;

    List<Palpites>listar();

    Palpites editar(Palpites palpites);

    void deletar(Long id_palpites);
}

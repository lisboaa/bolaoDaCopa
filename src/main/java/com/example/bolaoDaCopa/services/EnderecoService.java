package com.example.bolaoDaCopa.services;

import com.example.bolaoDaCopa.models.Endereco;

import java.util.List;

public interface EnderecoService {

    List<Endereco> listarEndereco();

    Endereco editarEndereco(Endereco endereco);

    Endereco salvarEndereco(Endereco endereco);

    void  deletarEndereco( Long id_endereco);
}

package com.example.bolaoDaCopa.dto;

import com.example.bolaoDaCopa.models.Endereco;
import com.example.bolaoDaCopa.models.Palpites;
import lombok.Data;

@Data
public class UsuarioDTO {

    private Long id_usuario;

    private String nome;

    private Integer idade;

    private Integer pontuacao;

    private String contato;

//    private Documento documento;
//
    private Endereco endereco;

    private Palpites palpites;


}
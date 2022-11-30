package com.example.bolaoDaCopa.dto;

import lombok.Data;

@Data
public class EnderecoDTO {

    private Long id_endereco;
    private String logradouro;
    private String numero;
    private String referencia;
    private String cep;
    private String cidade;
    private String estado;
}

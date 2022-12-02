package com.example.bolaoDaCopa.DTO;

import lombok.Data;

@Data
public class ClassificacaoDTO {

    private Long id_classificacao;

    private Integer vitorias;

    private Integer derrotas;

    private Integer empates;

    private Integer gols_feitos;

    private Integer gols_contra;

    private Integer saldo_gols;

    private Integer pontuacao;

}

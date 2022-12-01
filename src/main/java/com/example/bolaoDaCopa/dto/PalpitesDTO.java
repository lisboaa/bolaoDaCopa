package com.example.bolaoDaCopa.DTO;

import com.example.bolaoDaCopa.models.Times;
import lombok.Data;

@Data
public class PalpitesDTO {

    private Long id_palpites;

    private Integer gols;

    private String artilheiro;

    private Integer vitorias;

    private Integer impates;

    private Integer derrotas;

    private Times times;

}

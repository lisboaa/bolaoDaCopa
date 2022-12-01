package com.example.bolaoDaCopa.dto;
import lombok.Data;
@Data
public class TimesDTO {

    private Long id_time;

    private String nome_selecao;

    private String nome_dos_jogadores;

    private String nome_do_tecnico;

    private String quantidade_de_jogos_ja_ganhos_na_pre_temporada;

    private String quantidade_de_jogos;
}
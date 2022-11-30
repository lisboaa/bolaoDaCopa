package com.example.bolaoDaCopa.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "Times")
public class Times {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_time")
    private Long id_time;

    @Column(name = "nome_selecao")
    private String nome_selecao;

    @Column(name = "nome_dos_jogadores")
    private String nome_dos_jogadores;

    @Column(name = "nome_do_tecnico")
    private String nome_do_tecnico;

    @Column(name = "quantidade_de_jogos_ja_ganhos_na_pre_temporada")
    private String quantidade_de_jogos_ja_ganhos_na_pre_temporada;

    @Column(name = "quantidade_de_jogos")
    private String quantidade_de_jogos;
}
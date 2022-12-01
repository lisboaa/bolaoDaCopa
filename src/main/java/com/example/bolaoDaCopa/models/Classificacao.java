package com.example.bolaoDaCopa.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "classificacao")
public class Classificacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_classificacao")
    private Long id_classificacao;

    @Column(name = "vitorias")
    private Integer vitorias;

    @Column(name = "derrotas")
    private Integer derrotas;

    @Column(name = "empates")
    private Integer empates;

    @Column(name = "gols_feitos")
    private Integer gols_feitos;

    @Column(name = "gols_contra")
    private Integer gols_contra;

    @Column(name = "saldo_gols")
    private Integer saldo_gols;

    @Column(name = "pontuacao")
    private Integer pontuacao;
}

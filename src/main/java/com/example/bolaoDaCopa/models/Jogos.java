package com.example.bolaoDaCopa.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="jogos")
public class Jogos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_jogos")
    private Long Id_jogos;

    @Column(name="grupos")
    private String grupos;

    @Column(name="enfrentamento")
    private String enfrentamento;

    @Column(name="dataDosJogos")
    private String dataDosJogos;

    @Column(name="classificações")
    private String classificações;
}

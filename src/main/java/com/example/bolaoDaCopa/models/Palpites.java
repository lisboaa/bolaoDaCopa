package com.example.bolaoDaCopa.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Table(name = "palpites")
public class Palpites {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_palpites")
    private Long id_palpites;

    @Column(name = "gols")
    private Integer gols;

    @Column(name = "artilheiro")
    private String artilheiro;

    @Column(name = "vitorias")
    private Integer vitorias;

    @Column(name = "impates")
    private Integer impates;

    @Column(name = "derrotas")
    private Integer derrotas;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.PERSIST}, fetch = FetchType.EAGER)
    @JoinTable(name = "palpites_times",
            joinColumns = @JoinColumn(name = "id_palpites"),
            inverseJoinColumns = @JoinColumn(name = "id_times"))
    private Times times;
}

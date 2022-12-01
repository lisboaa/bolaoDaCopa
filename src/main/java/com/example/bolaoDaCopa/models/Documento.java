package com.example.bolaoDaCopa.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "documento")

        public class Documento {
            @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            @Column(name = "id_documento")
            private Long id_documento;
            @Column(name = "cpf")
            private String cpf;
            @Column(name = "cnpj")
            private String cnpj;
            @Column(name = "rg")
            private String rg;

            public Object getNome() {
                return null;
            }

        }

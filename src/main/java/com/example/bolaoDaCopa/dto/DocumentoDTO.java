package com.example.bolaoDaCopa.dto;

import lombok.Data;
@Data
class DocumentoDTO {
        private Long id_documento;
        private String cpf;
        private String cnpj;
        private String rg;
}
package com.example.bolaoDaCopa.services;


import com.example.bolaoDaCopa.models.Documento;

import java.util.List;

public interface DocumentoService {

        List <Documento> listarDocumento();

        Documento editarDocumento (Documento documento);

        Documento salvarDocumento (Documento documento);

        void deletarDocumento (Long id_documento);
    }


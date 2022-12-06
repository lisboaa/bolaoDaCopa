package com.example.bolaoDaCopa.controllers;
import com.example.bolaoDaCopa.models.Documento;

import com.example.bolaoDaCopa.services.DocumentoServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin
public class DocumentoController {


        final DocumentoServiceImpl documentoServiceImpl;

        public DocumentoController(DocumentoServiceImpl documentoService) {
            this.documentoServiceImpl = documentoService;
        }

        @PostMapping(value = "/salvarDocumento")
        public ResponseEntity<Object> salvarDocumento(@RequestBody Documento documento)  {
            Documento response = documentoServiceImpl.salvarDocumento (documento);
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
        }

        @GetMapping(value = "/buscarDocumento")
        public ResponseEntity<Object> buscarDocumento() {
            List<Documento> response = documentoServiceImpl.listarDocumento();
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
        }

        @PutMapping(value = "/alterarDocumento")
        public ResponseEntity<Object> alterarDocumento(@RequestBody Documento documento) {
            Documento response = documentoServiceImpl.editarDocumento(documento);
            return ResponseEntity.status(HttpStatus.CREATED).body(response);

        }

        @DeleteMapping(value = "/deletarDocumento")
        public ResponseEntity<Object> deletarDocumento(Long id_documento) {
            documentoServiceImpl.deletarDocumento(id_documento);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }
    }

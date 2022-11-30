package com.example.bolaoDaCopa.controllers;

import com.example.bolaoDaCopa.models.Endereco;
import com.example.bolaoDaCopa.services.EnderecoServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin

public class EnderecoController {

    final EnderecoServiceImpl enderecoServiceImpl;

    public EnderecoController(EnderecoServiceImpl enderecoService) {
        this.enderecoServiceImpl = enderecoService;
    }

    @PostMapping(value = "/salvarEndereco")
    public ResponseEntity<Object> salvarEndereco(@RequestBody Endereco endereco) throws Exception {
        Endereco response = enderecoServiceImpl.salvarEndereco(endereco);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping(value = "/buscarEndereco")
    public ResponseEntity<Object> buscarEndereco() {
        List <Endereco> response = enderecoServiceImpl.listarEndereco();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping(value = "/editarEndereco")
    public ResponseEntity<Object> editarEndereco(@RequestBody Endereco endereco) {
        Endereco response = enderecoServiceImpl.editarEndereco(endereco);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @DeleteMapping(value = "/deletarEndereco")
    public ResponseEntity<Object> deletarEndereco( Long id_endereco) {
        enderecoServiceImpl.deletarEndereco(id_endereco);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}

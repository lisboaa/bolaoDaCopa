package com.example.bolaoDaCopa.controllers;

import com.example.bolaoDaCopa.models.Jogos;
import com.example.bolaoDaCopa.services.JogosServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin

public class JogosController {
    final JogosServiceImpl jogosServiceImpl;

    public JogosController(JogosServiceImpl jogosService) {
        this.jogosServiceImpl = jogosService;
    }

    @PostMapping(value = "/salvarJogos")
    public ResponseEntity<Object> salvarJogos(@RequestBody Jogos jogos) throws Exception {
        Jogos response = jogosServiceImpl.salvar(jogos);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    @GetMapping(value ="/buscarJogos")
    public ResponseEntity<Object>buscarJogos(){
        List <Jogos> response = jogosServiceImpl.listar();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping(value ="/alterarJogos")
    public ResponseEntity<Object>alterarJogos(@RequestBody Jogos jogos) {
        Jogos response = jogosServiceImpl.editar(jogos);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @DeleteMapping(value = "/deletarJogos")
    public ResponseEntity<Object>deletarJogos(Long id_jogos) {
        jogosServiceImpl.deletar(id_jogos);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}

package com.example.bolaoDaCopa.controllers;

import com.example.bolaoDaCopa.models.Jogos;
import com.example.bolaoDaCopa.services.JogosServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
}

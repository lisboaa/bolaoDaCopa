package com.example.bolaoDaCopa.controllers;

import com.example.bolaoDaCopa.models.Classificacao;
import com.example.bolaoDaCopa.services.ClassificacaoServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin

public class ClassificacaoController {
    final ClassificacaoServiceImpl classificacaoServiceImpl;

    public ClassificacaoController(ClassificacaoServiceImpl classificacaoService) {
        this.classificacaoServiceImpl = classificacaoService;
    }
    @PostMapping(value = "/salvarClassificacao")
    public ResponseEntity<Object>salvarClassificacao(@RequestBody Classificacao classificacao) {
        Classificacao response = classificacaoServiceImpl.salvar(classificacao);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    @GetMapping (value = "/buscarClassificacao")
    public ResponseEntity<Object>buscarClassificacao() {
        List<Classificacao> response = classificacaoServiceImpl.listar();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    @PutMapping(value = "/alterarClassificacao")
    public ResponseEntity<Object>alterarClassificacao(@RequestBody Classificacao classificacao) {
        Classificacao response = classificacaoServiceImpl.editar(classificacao);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    @DeleteMapping(value = "/deletarClassificacao")
    public ResponseEntity<Object>deletarClassificacao(Long id_classificacao) {
        classificacaoServiceImpl.deletar(id_classificacao);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}

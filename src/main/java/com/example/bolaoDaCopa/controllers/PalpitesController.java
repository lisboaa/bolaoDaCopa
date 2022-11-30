package com.example.bolaoDaCopa.controllers;

import com.example.bolaoDaCopa.models.Palpites;
import com.example.bolaoDaCopa.services.PalpitesServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin
public class PalpitesController {
    final PalpitesServiceImpl palpitesServiceImpl;

    public PalpitesController(PalpitesServiceImpl palpitesService) {
        this.palpitesServiceImpl = palpitesService;
    }

    @PostMapping(value = "/salvarPalpites")
    public ResponseEntity<Object> salvarPalpites(@RequestBody Palpites palpites) throws Exception{
        Palpites response = palpitesServiceImpl.salvar(palpites);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping(value ="/buscarPalpites")
    public ResponseEntity<Object>buscarPalpites(){
        List<Palpites> response = palpitesServiceImpl.listar();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping(value ="/alterarPalpites")
    public ResponseEntity<Object>alterarPalpites(@RequestBody Palpites palpites) {
        Palpites response = palpitesServiceImpl.editar(palpites);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @DeleteMapping(value = "/deletarPalpites")
    public ResponseEntity<Object>deletarPalpites(Long id_palpites) {
        palpitesServiceImpl.deletar(id_palpites);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}

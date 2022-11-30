package com.example.bolaoDaCopa.controllers;

import com.example.bolaoDaCopa.models.Usuario;
import com.example.bolaoDaCopa.services.UsuarioServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api")
@CrossOrigin
public class UsuarioController {

    final UsuarioServiceImpl usuarioServiceImpl;

    public UsuarioController(UsuarioServiceImpl usuarioService) {
        this.usuarioServiceImpl = usuarioService;
    }


    @PostMapping(value = "/salvarUsuario")
    public ResponseEntity<Object>salvarUsuario(@RequestBody Usuario usuario) throws Exception{
        Usuario response = usuarioServiceImpl.salvar(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping(value ="/buscarUsuario")
    public ResponseEntity<Object>buscarUsuario(){
        List<Usuario> response = usuarioServiceImpl.listar();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping(value ="/alterarUsuario")
    public ResponseEntity<Object>alterarUsuario(@RequestBody Usuario usuario) {
        Usuario response = usuarioServiceImpl.editar(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @DeleteMapping(value = "/deletarUsuario")
    public ResponseEntity<Object>deletarUsuario(Long id_usuario) {
        usuarioServiceImpl.deletar(id_usuario);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}

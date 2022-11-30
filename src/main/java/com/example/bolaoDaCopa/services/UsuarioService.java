package com.example.bolaoDaCopa.services;

import com.example.bolaoDaCopa.models.Usuario;

import java.util.List;

public interface UsuarioService {
    Usuario salvar (Usuario usuario) throws Exception;

    List<Usuario> listar();

    Usuario editar(Usuario usuario);

    void deletar (Long id_usuario);
}

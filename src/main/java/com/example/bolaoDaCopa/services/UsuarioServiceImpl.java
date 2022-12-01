package com.example.bolaoDaCopa.services;

import com.example.bolaoDaCopa.models.Usuario;
import com.example.bolaoDaCopa.repositories.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    final UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario salvar(Usuario usuario) throws Exception {
        List<Usuario> listaDeUsuario = usuarioRepository.findAll();//vai ser utilizado quando for necessario as validaçoes
        return usuarioRepository.save(usuario);
    }

    @Override
    public List<Usuario> listar() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario editar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public void deletar(Long id_usuario) {
        usuarioRepository.deleteById(id_usuario);
    }
}

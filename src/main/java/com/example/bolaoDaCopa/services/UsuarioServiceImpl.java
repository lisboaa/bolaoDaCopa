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
        for (Usuario usuario1: listaDeUsuario) {
            if (usuario1.getDocumento().getCpf() !=null && usuario1.getDocumento().getRg() != null){
                throw new Exception("Por gentileza ensira um CPF e RG");
            }
            if (usuario.getDocumento().getCpf().equals(usuario1.getDocumento().getCpf()) && usuario.getDocumento().getRg().equals(usuario1.getDocumento().getRg())){
                throw new Exception("Documentos ja existemte");
            }
            if (usuario1.getEndereco().getCep()!=null && usuario1.getEndereco().getNumero() !=null){
                throw new Exception("Por gentileza Informe um CEP e um numero de residencia");
            }

        }
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

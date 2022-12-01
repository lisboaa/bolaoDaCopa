package com.example.bolaoDaCopa.repositories;

import com.example.bolaoDaCopa.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}

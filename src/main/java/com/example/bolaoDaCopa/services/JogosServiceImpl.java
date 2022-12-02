package com.example.bolaoDaCopa.services;

import com.example.bolaoDaCopa.models.Jogos;
import com.example.bolaoDaCopa.repositories.JogosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogosServiceImpl implements JogosService {

    final JogosRepository jogosRepository;

    public JogosServiceImpl(JogosRepository jogosRepository) {
        this.jogosRepository = jogosRepository;
    }

    @Override
    public Jogos salvarJogos(Jogos jogos) {
        return jogosRepository.save(jogos);
    } 
    @Override
    public List <Jogos> listarJogos() {
        return jogosRepository.findAll();
    }

    @Override
    public Jogos editarJogos(Jogos jogos) {
        return jogosRepository.save(jogos);
    }

    @Override
    public void deletarJogos(Long id_jogos) {
        jogosRepository.deleteById(id_jogos);
    }
}

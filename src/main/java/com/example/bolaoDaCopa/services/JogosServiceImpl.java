package com.example.bolaoDaCopa.services;

import com.example.bolaoDaCopa.models.Jogos;
import com.example.bolaoDaCopa.repositories.JogosRepository;
import org.springframework.stereotype.Service;

@Service
public class JogosServiceImpl implements JogosService {
    final JogosRepository jogosRepository;
    public JogosServiceImpl(JogosRepository jogosRepository) {
        this.jogosRepository = jogosRepository;
    }
    @Override
    public Jogos salvar(Jogos jogos) throws Exception {
        return jogosRepository.save(jogos);
    } }

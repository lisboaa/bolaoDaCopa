package com.example.bolaoDaCopa.services;

import com.example.bolaoDaCopa.models.Jogos;
import com.example.bolaoDaCopa.repositories.JogosRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogosServiceImpl implements JogosService {
    final JogosRepository jogosRepository;
    public JogosServiceImpl(JogosRepository jogosRepository) {
        this.jogosRepository = jogosRepository;
    }
    @Override
    public Jogos salvar(Jogos jogos) throws Exception {
        List<Jogos> listaDeJogos = jogosRepository.findAll();
        for (Jogos jogos1: listaDeJogos) {
        if(jogos.getEnfrentamento().equals(jogos1.getEnfrentamento()) && jogos.getDataDosJogos().equals(jogos1.getDataDosJogos())){
            throw new Exception("Esses times já se enfrentaram hoje! Por favor tente outros times e/ou datas,classificações e grupos diferentes.");
        }else if(jogos.getEnfrentamento().equals(jogos1.getEnfrentamento()) && jogos.getGrupos().equals(jogos1.getGrupos())){
            throw new Exception("Esses times já se enfrentaram nesse mesmo grupo!");
        }else if (jogos.getDataDosJogos().equals(jogos1.getDataDosJogos()) && jogos.getGrupos()!= jogos1.getGrupos()){
            throw new Exception("Esses times não podem se enfrentar em grupos diferentes na mesma data");
        }}
        return jogosRepository.save(jogos);
    } 
    @Override
    public List <Jogos> listar() {
        return jogosRepository.findAll();
    }

    @Override
    public Jogos editar(Jogos jogos) {
        return jogosRepository.save(jogos);
    }

    @Override
    public void deletar(Long id_jogos) {
        jogosRepository.deleteById(id_jogos);
    }
}

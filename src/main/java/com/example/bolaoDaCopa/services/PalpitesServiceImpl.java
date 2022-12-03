package com.example.bolaoDaCopa.services;

import com.example.bolaoDaCopa.models.Palpites;
import com.example.bolaoDaCopa.repositories.PalpitesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PalpitesServiceImpl implements PalpitesService{

    final PalpitesRepository palpitesRepository;

    public PalpitesServiceImpl(PalpitesRepository palpitesRepository) {
        this.palpitesRepository = palpitesRepository;
    }

    @Override
    public Palpites salvar(Palpites palpites) throws Exception {
        List<Palpites> listaDePalpites = palpitesRepository.findAll();
        for (Palpites palpites1: listaDePalpites){
            if(palpites.getTimes().getNome_selecao() == null){
                throw new Exception("Nome do time  não informado");
            }
            if (palpites.getVitorias() == null && palpites.getImpates() == null && palpites.getDerrotas() == null){
                throw new Exception("Palpite não informado");
            }
             palpites.setArtilheiro(palpites1.getTimes().getNome_dos_jogadores());

            if(palpites.getArtilheiro() == null){
                throw new Exception("Artilheiro não informado");
            }

        }
        return palpitesRepository.save(palpites);
    }

    @Override
    public List<Palpites> listar() {
        return palpitesRepository.findAll();
    }

    @Override
    public Palpites editar(Palpites palpites) {
        return palpitesRepository.save(palpites);
    }

    @Override
    public void deletar(Long id_palpites) {
        palpitesRepository.deleteById(id_palpites);
    }
}

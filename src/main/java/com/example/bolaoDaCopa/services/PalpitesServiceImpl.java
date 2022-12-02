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
    public Palpites salvarPalpites(Palpites palpites) {
        return palpitesRepository.save(palpites);
    }

    @Override
    public List<Palpites> listarPalpites() {
        return palpitesRepository.findAll();
    }

    @Override
    public Palpites editarPalpites(Palpites palpites) {
        return palpitesRepository.save(palpites);
    }

    @Override
    public void deletarPalpites(Long id_palpites) {
        palpitesRepository.deleteById(id_palpites);
    }
}

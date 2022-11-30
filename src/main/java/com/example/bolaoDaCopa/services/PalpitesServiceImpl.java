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

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
            if(palpites1.getTimes().getNome_selecao() !=null){

            }
            if (palpites1.getVitorias() == null && palpites1.getImpates() == null && palpites1.getDerrotas() == null){
                throw new Exception("Palpite não informado");
            }
            if (palpites.getVitorias().equals(palpites1.getVitorias()) || palpites.getImpates().equals(palpites1.getImpates()) || palpites.getDerrotas().equals(palpites1.getDerrotas())){
                throw new Exception("Palpite escolhido");
            }
            palpites.setArtilheiro(palpites.getTimes().getNome_dos_jogadores());

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

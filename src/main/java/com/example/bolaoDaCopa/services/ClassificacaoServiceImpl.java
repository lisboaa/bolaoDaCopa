package com.example.bolaoDaCopa.services;

import com.example.bolaoDaCopa.models.Classificacao;
import com.example.bolaoDaCopa.repositories.ClassificacaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassificacaoServiceImpl implements ClassificacaoService {
    final ClassificacaoRepository classificacaoRepository;

    public ClassificacaoServiceImpl(ClassificacaoRepository classificacaoRepository) {
        this.classificacaoRepository = classificacaoRepository;
    }
    @Override
    public List<Classificacao> listar(){
        return classificacaoRepository.findAll();
    }
    @Override
    public Classificacao editar(Classificacao classificacao) {
        return classificacaoRepository.save(classificacao);
    }
    @Override
    public Classificacao salvar(Classificacao classificacao) {
        return classificacaoRepository.save(classificacao);
    }
    @Override
    public void deletar (Long id_classificacao) {
        classificacaoRepository.deleteById(id_classificacao);
    }
}

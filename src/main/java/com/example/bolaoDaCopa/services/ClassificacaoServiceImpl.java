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
    public List<Classificacao> listarClassificacao(){
        return classificacaoRepository.findAll();
    }
    @Override
    public Classificacao editarClassificacao(Classificacao classificacao) {
        return classificacaoRepository.save(classificacao);
    }
    @Override
    public Classificacao salvarClassificacao(Classificacao classificacao) {
        return classificacaoRepository.save(classificacao);
    }
    @Override
    public void deletarClassificacao(Long id_classificacao) {
        classificacaoRepository.deleteById(id_classificacao);
    }
}

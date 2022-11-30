package com.example.bolaoDaCopa.services;

import com.example.bolaoDaCopa.models.Endereco;
import com.example.bolaoDaCopa.repositories.EnderecoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoServiceImpl implements EnderecoService {

    final EnderecoRepository enderecoRepository;

    public EnderecoServiceImpl(EnderecoRepository enderecoRepository) {
        this.enderecoRepository = enderecoRepository;
    }

        @Override
        public List<Endereco> listarEndereco() {
            return enderecoRepository.findAll();
        }

        @Override
    public Endereco editarEndereco (Endereco endereco) {
        return enderecoRepository.save(endereco);
        }

        @Override
    public Endereco salvarEndereco( Endereco endereco) {
        return enderecoRepository.save(endereco);
        }

        @Override
        public void deletarEndereco(Long id_endereco) {
            enderecoRepository.deleteById(id_endereco);
        }
    }

package com.example.bolaoDaCopa.services;

import com.example.bolaoDaCopa.models.Times;

import java.util.List;

public interface TimesService {

    List<Times> buscarTimes();

    Times editar(Times times);

    Times salvarTimes(Times times) throws Exception;

    void deletar(Long id_times);
}
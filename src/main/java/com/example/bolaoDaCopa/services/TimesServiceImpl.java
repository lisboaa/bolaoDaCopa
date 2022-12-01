package com.example.bolaoDaCopa.services;
import com.example.bolaoDaCopa.models.Times;
import com.example.bolaoDaCopa.repositories.TimesRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class TimesServiceImpl implements com.example.bolaoDaCopa.services.TimesService {

    final TimesRepository timesRepository;

    public TimesServiceImpl(TimesRepository timesRepository) {
        this.timesRepository = timesRepository;
    }

    @Override
    public List<Times> buscarTimes(){
        return timesRepository.findAll();
    }

    @Override
    public Times editar(Times times) {
        return timesRepository.save(times);
    }

    @Override
    public Times salvarTimes(Times times) throws Exception {
        List<Times> listaDeTimes = timesRepository.findAll();
        for (Times informacaoDeTimes: listaDeTimes) {
            if (times.getNome_selecao().equals(informacaoDeTimes.getNome_selecao())) {
                throw new EntityNotFoundException(" Essa Seleção Já está Cadastrada! ");
            }
            if (times.getNome_do_tecnico().equals(informacaoDeTimes.getNome_do_tecnico())) {
                throw new EntityNotFoundException(" Este técnico já está Cadastrado! ");
            }
            if (times.getNome_dos_jogadores().equals(informacaoDeTimes.getNome_dos_jogadores())) {
                throw new EntityNotFoundException(" Este Jogador já está cadastrado! ");
            }

        }
        return timesRepository.save(times);
    }

    public void deletar(Long  id_times) {
        timesRepository.deleteById(id_times);

    }
}
package com.example.bolaoDaCopa.controllers;
import com.example.bolaoDaCopa.models.Times;
import com.example.bolaoDaCopa.services.TimesServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin
public class TimesController {
    final TimesServiceImpl timesServiceImpl;


    public TimesController(TimesServiceImpl timesServiceImpl) throws Exception {
        this.timesServiceImpl = timesServiceImpl;
    }

    @PostMapping(value = "/salvarTimes")
    public ResponseEntity<Object> salvarTimes(@RequestBody Times times) throws Exception{
        Times response = timesServiceImpl.salvarTimes(times);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping(value = "/buscarTimes")
    public ResponseEntity<Object> buscarTimes() throws  Exception{
        List<Times> response = timesServiceImpl.buscarTimes();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping(value = "/editarTimes")
    public ResponseEntity<Object> editarTimes(@RequestBody Times times) throws Exception{
        Times response = timesServiceImpl.editar(times);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @DeleteMapping(value = "/deletarTimes")
    public  ResponseEntity<Object> deletarTimes(Long id_times) throws Exception{
        timesServiceImpl.deletar(id_times);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


}


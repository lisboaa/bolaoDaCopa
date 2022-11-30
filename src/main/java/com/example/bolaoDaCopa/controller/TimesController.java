package com.example.bolaoDaCopa.controller;
import com.example.bolaoDaCopa.models.Times;
import com.example.bolaoDaCopa.services.TimesServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
}

//
//    @PostMapping(value = "/salvarPessoa")
//    public ResponseEntity<Object> salvarPessoa(@RequestBody Pessoa pessoa) throws Exception {
//        Pessoa response = pessoaServiceImpl.salvarPessoa(pessoa);
//        return ResponseEntity.status(HttpStatus.CREATED).body(response);
//    }
//
//    @GetMapping(value = "/buscarPessoa")
//    public ResponseEntity<Object> buscarPessoa() {
//        List<Pessoa> response = pessoaServiceImpl.buscarPessoa();
//        return ResponseEntity.status(HttpStatus.CREATED).body(response);
//    }
//
//    @PutMapping(value = "/editarPessoa")
//    public ResponseEntity<Object> editarPessoa(@RequestBody Pessoa pessoa) {
//        Pessoa response = pessoaServiceImpl.editar(pessoa);
//        return ResponseEntity.status(HttpStatus.CREATED).body(response);
//    }
//
//    @DeleteMapping(value = "/deletarPessoa")
//    public  ResponseEntity<Object> deletarPessoa(Long id_pessoa){
//        pessoaServiceImpl.deletar(id_pessoa);
//        return ResponseEntity.status(HttpStatus.CREATED).build();
//    }
//
//
//}



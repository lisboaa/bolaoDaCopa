package com.example.bolaoDaCopa.exceptions;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import java.time.Instant;
import java.util.Arrays;

@ControllerAdvice
public class ControllerExceptionsHandler {

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<StandardException> entityNotFound(EntityNotFoundException e, HttpServletRequest request){
        StandardException err = new StandardException();
        err.setTimestamp(String.valueOf(Instant.now()));
        err.setStatus(String.valueOf(HttpStatus.NOT_FOUND.value()));
        err.setError(e.getMessage());
        err.setTrace(" nome_arquivo: " + Arrays.stream(
                e.getStackTrace()).findFirst().get().getFileName()+
                " linha: " +Arrays.stream(e.getStackTrace()).findFirst().get().getLineNumber()+
                " nome_metodo: " + Arrays.stream(e.getStackTrace()).findFirst().get().getMethodName());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
    }

}



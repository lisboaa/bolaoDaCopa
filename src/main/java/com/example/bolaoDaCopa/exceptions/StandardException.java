package com.example.bolaoDaCopa.exceptions;

import lombok.Data;

import java.io.Serializable;

@Data
public class StandardException implements Serializable {

    private static final long serialVersionUID = 1L;

    private String timeStamp;
    private String status;
    private String error;
    private String trace;

    public StandardException(){

    }
}


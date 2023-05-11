package com.dikbiyik.ws.exception;

public class NotFoundException extends RuntimeException{

    private Long serialID = 85185919491L;
    
    public NotFoundException(){

    }

    public NotFoundException(String msg) {
        super(msg);
    }
}

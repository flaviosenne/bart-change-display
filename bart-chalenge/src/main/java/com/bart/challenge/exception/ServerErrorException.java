package com.bart.challenge.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ServerErrorException extends RuntimeException{
    public ServerErrorException(String message){
        super(message);
    }
}

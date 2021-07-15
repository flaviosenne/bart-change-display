package com.bart.challenge.exception;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(ServerErrorException.class)
    public ResponseEntity<?> handleBadRequestException(ServerErrorException bad){
        ExceptionDetails badDetails = ExceptionDetails.builder()
                .timestamp(new Date().getTime())
                .status(HttpStatus.BAD_REQUEST.value())
                .title("formato inválido")
                .message(bad.getMessage())
                .build();

        return new ResponseEntity<>(badDetails, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}


package com.example.demo;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponseException extends ResponseEntityExceptionHandler  {


    @ExceptionHandler(value = { ResponseException.class })
    protected ResponseEntity<Object> handleConflict(ResponseException ex, WebRequest request) {
        String bodyOfResponse = ex.getMessage();
        HttpStatus status = ex.getStatus();
        return handleExceptionInternal(ex, bodyOfResponse,
                new HttpHeaders(), status, request);
    }
}
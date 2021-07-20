package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper=true)
public class ResponseException extends Exception{

    private HttpStatus status;
    private String message;

    public ResponseException(HttpStatus status, String message){
        super();
        this.message=message;
        this.status=status;

    }

}

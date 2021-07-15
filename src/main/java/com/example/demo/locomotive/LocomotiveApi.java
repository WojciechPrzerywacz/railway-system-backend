package com.example.demo.locomotive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/locomotives")
@CrossOrigin
public class LocomotiveApi {

    @Autowired
    private LocomotiveManager locomotives;

    @GetMapping
    public ResponseEntity<List<Locomotive>>  getAll(){
        return new ResponseEntity<List<Locomotive>>(locomotives.findAll(), HttpStatus.OK);
    }
    //    public List<Locomotive> getAll() {
//        return locomotives.findAll();
//    }
}

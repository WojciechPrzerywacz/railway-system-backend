package com.example.demo.locomotive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/locomotives")
@CrossOrigin
public class LocomotiveApi {

    @Autowired
    private LocomotiveManager locomotives;

    @GetMapping
    public List<Locomotive> getAll() {
        return locomotives.findAll();
    }
}

package com.example.demo.wagon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/wagons")
@CrossOrigin
public class WagonApi {

    @Autowired
    private WagonManager wagons;

    @GetMapping
    public List<Wagon> getAll() {
        return wagons.findAll();
    }

    @PostMapping
    public Wagon addWagon(@RequestBody Wagon wagon){ return wagons.save(wagon);}
}

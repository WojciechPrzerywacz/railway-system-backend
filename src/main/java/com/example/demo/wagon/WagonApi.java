package com.example.demo.wagon;

import com.example.demo.trains.Train;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/wagons")
@CrossOrigin
public class WagonApi {

    @Autowired
    private WagonManager wagons;

    @GetMapping
    public ResponseEntity<List<Wagon>> getAll(){
        return new ResponseEntity<List<Wagon>>(wagons.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public Wagon addWagon(@RequestBody Wagon wagon){ return wagons.save(wagon);}
}

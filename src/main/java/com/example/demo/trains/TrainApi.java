package com.example.demo.trains;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/trains")
@CrossOrigin
public class TrainApi {

    @Autowired
    private TrainManager trains;

    @GetMapping
    public List<Train> getAll() {
        return trains.findAll();
    }

    @GetMapping("/{index}")
    public Train getById(@PathVariable Long index){
        return trains.findById(index);
    }

    @PostMapping
    public Train addTrain(@RequestBody TrainCreateRequest trainCreateRequest){ return trains.create(trainCreateRequest);}
}

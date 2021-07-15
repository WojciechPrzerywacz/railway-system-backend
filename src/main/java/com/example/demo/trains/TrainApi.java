package com.example.demo.trains;

import com.example.demo.passages.Passages;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<Train>> getAll(){
        return new ResponseEntity<List<Train>>(trains.findAll(), HttpStatus.OK);
    }
    @GetMapping("/{index}")
    public ResponseEntity<Train> getById(@PathVariable Long index){
        return new ResponseEntity<Train>(trains.findById(index), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Train> addTrain(@RequestBody TrainCreateRequest trainCreateRequest){ return new ResponseEntity<Train>(trains.create(trainCreateRequest), HttpStatus.OK);}
}

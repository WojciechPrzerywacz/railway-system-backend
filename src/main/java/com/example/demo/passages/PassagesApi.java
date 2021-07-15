package com.example.demo.passages;

import com.example.demo.passages.dto.PassageCreateRequest;
import com.example.demo.trains.Train;
import com.example.demo.trains.TrainCreateRequest;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/passages")
@CrossOrigin
@Builder
public class PassagesApi {
    @Autowired
    private PassagesManager passages;

    @GetMapping
    public ResponseEntity<List<Passages>> getAll(){
        return new ResponseEntity<List<Passages>>(passages.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{index}")
    public Passages getById(@PathVariable Long index){
        return passages.findById(index);
    }

    @PostMapping
    public Passages addPassage(@RequestBody PassageCreateRequest passageCreateRequest){ return passages.create(passageCreateRequest);}

    @DeleteMapping("/{index}")
    public void deletePassage(@RequestParam Long index) {
        passages.deleteById(index);
    }
}

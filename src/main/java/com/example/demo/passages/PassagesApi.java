package com.example.demo.passages;

import com.example.demo.passages.dto.PassageCreateRequest;
import com.example.demo.trains.Train;
import com.example.demo.trains.TrainCreateRequest;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
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
    public List<Passages> getAll() {
        return passages.findAll();
    }

    @GetMapping("/{index}")
    public Optional<Passages> getById(@PathVariable Long index){
        return passages.findById(index);
    }

    @PostMapping
    public Passages addPassage(@RequestBody PassageCreateRequest passageCreateRequest){ return passages.create(passageCreateRequest);}
}

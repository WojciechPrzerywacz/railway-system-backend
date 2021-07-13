package com.example.demo.passages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/passages")
@CrossOrigin
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
}

package com.example.demo.passages;

import com.example.demo.passages.Passages;
import com.example.demo.passages.PassagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PassagesManager {
    @Autowired
    private PassagesRepository passagesRepository;


    public List<Passages> findAll() {
        return passagesRepository.findAll();
    }

    public Passages save(Passages passages) {
        return passagesRepository.save(passages);
    }

    public Optional<Passages> findById(Long id) {
        return passagesRepository.findById(id);
    }

}
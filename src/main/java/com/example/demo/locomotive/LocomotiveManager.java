package com.example.demo.locomotive;

import com.example.demo.locomotive.Locomotive;
import com.example.demo.locomotive.LocomotiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocomotiveManager {

    @Autowired
    private LocomotiveRepository locomotiveRepository;


    public List<Locomotive> findAll() {
        return locomotiveRepository.findAll();
    }

    public Locomotive save(Locomotive locomotive) {
        return locomotiveRepository.save(locomotive);
    }


}


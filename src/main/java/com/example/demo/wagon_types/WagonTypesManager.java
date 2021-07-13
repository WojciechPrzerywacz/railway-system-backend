package com.example.demo.wagon_types;

import com.example.demo.wagon.Wagon;
import com.example.demo.wagon.WagonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WagonTypesManager {

    @Autowired
    private WagonTypesRepository wagonTypesRepository;

    public List<WagonTypes> findAll() {
        return wagonTypesRepository.findAll();
    }

}

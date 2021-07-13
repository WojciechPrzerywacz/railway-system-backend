package com.example.demo.wagon;

import com.example.demo.wagon.Wagon;
import com.example.demo.wagon.WagonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WagonManager {

    @Autowired
    private WagonRepository wagonRepository;

    public List<Wagon> findAll() {
        return wagonRepository.findAll();
    }

    public Wagon save(Wagon wagon) {
        return wagonRepository.save(wagon);
    }

    public void deleteById(Long id) { wagonRepository.deleteById(id);}
}

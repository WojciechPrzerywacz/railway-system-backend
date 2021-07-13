package com.example.demo.trains;

import com.example.demo.trains.Train;
import com.example.demo.trains.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrainManager {

    @Autowired
    private TrainRepository trainRepository;


    public List<Train> findAll() {
        return trainRepository.findAll();
    }

    public Train save(Train train) {
        return trainRepository.save(train);
    }

    public Optional<Train> findById(Long id) {
        return trainRepository.findById(id);
    }

    public void deleteById(Long id) { trainRepository.deleteById(id);}

}

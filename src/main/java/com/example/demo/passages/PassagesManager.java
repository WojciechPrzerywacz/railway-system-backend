package com.example.demo.passages;

import com.example.demo.passages.Passages;
import com.example.demo.passages.PassagesRepository;
import com.example.demo.passages.dto.PassageCreateRequest;
import com.example.demo.trains.Train;
import com.example.demo.trains.TrainManager;
import com.example.demo.trains.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PassagesManager {
    @Autowired
    private PassagesRepository passagesRepository;
    @Autowired
    private TrainManager trainManager;

    public List<Passages> findAll() {
        return passagesRepository.findAll();
    }

    public Passages create(PassageCreateRequest request) {

        Passages p = Passages.builder()
                .start(request.getStartingPlace())
                .destination(request.getEndingPlace())
                .train(trainManager.findById(request.getLocomotiveId()))
                .build();


        return passagesRepository.save(p);
    }

    public Optional<Passages> findById(Long id) {
        return passagesRepository.findById(id);
    }

}

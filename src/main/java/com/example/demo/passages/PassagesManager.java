package com.example.demo.passages;

import com.example.demo.ResponseException;
import com.example.demo.RestResponseException;
import com.example.demo.locomotive.Locomotive;
import com.example.demo.locomotive.LocomotiveManager;
import com.example.demo.passages.Passages;
import com.example.demo.passages.PassagesRepository;
import com.example.demo.passages.dto.PassageCreateRequest;
import com.example.demo.trains.Train;
import com.example.demo.trains.TrainManager;
import com.example.demo.trains.TrainRepository;
import com.example.demo.wagon.Wagon;
import com.example.demo.wagon.dto.WagonCreateRequest;
import com.example.demo.wagon_types.WagonTypes;
import com.example.demo.wagon_types.WagonTypesManager;
import net.bytebuddy.implementation.bytecode.Throw;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PassagesManager {
    @Autowired
    private PassagesRepository passagesRepository;
    @Autowired
    private TrainManager trainManager;
    @Autowired
    private LocomotiveManager locomotiveManager;
    @Autowired
    private WagonTypesManager wagonTypesManager;

    public List<Passages> findAll() {
        return passagesRepository.findAll();
    }

    public Passages create(PassageCreateRequest request) throws  ResponseException {

        String name = request.getPassageName();

        if(!passagesRepository.findByPassageName(name).isEmpty()){
            throw new ResponseException(HttpStatus.BAD_REQUEST, "Passage with this name already exists");
        }

        List<Wagon> wagons = new ArrayList<>();

        for(WagonCreateRequest w : request.getWagonsList()){
            WagonTypes type = wagonTypesManager.findById(w.getId());

            Wagon wagon = Wagon.builder()
                    .type(type.getType())
                    .max_load(type.getMax_load())
                    .load_weight(w.getLoad())
                    .build();

            wagons.add(wagon);
        }

        Locomotive baseLoco = locomotiveManager.findById(request.getLocomotiveId());

        Train t = Train.builder().locomotive(baseLoco)
                .wagons(wagons)
                .build();

        Passages p = Passages.builder()
                .passageName(name)
                .start(request.getStartingPlace())
                .destination(request.getEndingPlace())
                .train(t)
                .build();

        return passagesRepository.save(p);
    }

    public Passages findById(Long id) throws  ResponseException {
        return passagesRepository.findById(id).orElseThrow(() -> new ResponseException(HttpStatus.BAD_REQUEST, "brak przejazdu o podanym id"));
    }

    public Boolean deleteById(Long id) throws ResponseException {
        //Passages p = findById(id);
        passagesRepository.delete(findById(id));
        return true;
    }

}

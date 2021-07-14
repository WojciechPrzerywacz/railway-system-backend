package com.example.demo.trains;

import com.example.demo.locomotive.Locomotive;
import com.example.demo.locomotive.LocomotiveManager;
import com.example.demo.trains.Train;
import com.example.demo.trains.TrainRepository;
import com.example.demo.wagon.Wagon;
import com.example.demo.wagon.dto.WagonCreateRequest;
import com.example.demo.wagon_types.WagonTypes;
import com.example.demo.wagon_types.WagonTypesManager;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TrainManager {

    @Autowired
    private TrainRepository trainRepository;
    @Autowired
    private LocomotiveManager locomotiveManager;
    @Autowired
    private WagonTypesManager wagonTypesManager;


    public List<Train> findAll() {
        return trainRepository.findAll();
    }


    public Train create(TrainCreateRequest request) {
        List<Wagon> wagons = new ArrayList<>();

        Locomotive baseLoco = locomotiveManager.findById(request.getLocomotiveId());


        for(WagonCreateRequest w : request.getWagonsList()){
            WagonTypes type = wagonTypesManager.findById(w.getId());

            Wagon wagon = Wagon.builder()
                    .type(type.getType())
                    .max_load(type.getMax_load())
                    .load_weight(w.getLoad())
                    .build();

            wagons.add(wagon);
        }


        Train t = Train.builder()
                .locomotive(baseLoco)
                .wagons(wagons)
                .build();


        return trainRepository.save(t);
    }

    public Train findById(Long id) {
        return trainRepository.findById(id).orElseThrow(() -> new RuntimeException("Brak traina o podanym ID"));
    }

    public Boolean deleteById(Long id) {

        Train t = findById(id);
        trainRepository.delete(t);
        return true;
    }
}

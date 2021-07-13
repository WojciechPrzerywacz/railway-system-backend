package com.example.demo.wagon_types;

import com.example.demo.wagon.Wagon;
import com.example.demo.wagon.WagonManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/wagontypes")
@CrossOrigin
public class WagonTypesApi {

    @Autowired
    private WagonTypesManager wagonTypes;

    @GetMapping
    public List<WagonTypes> getAll() {
        return wagonTypes.findAll();
    }
}

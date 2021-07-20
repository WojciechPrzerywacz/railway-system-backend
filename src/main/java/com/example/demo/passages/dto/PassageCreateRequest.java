package com.example.demo.passages.dto;

import com.example.demo.wagon.Wagon;
import com.example.demo.wagon.dto.WagonCreateRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PassageCreateRequest {
    private String passageName;
    private String startingPlace;
    private String endingPlace;
    private Long locomotiveId;
    private List<WagonCreateRequest> wagonsList;
}

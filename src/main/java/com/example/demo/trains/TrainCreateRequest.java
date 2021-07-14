package com.example.demo.trains;

import com.example.demo.wagon.dto.WagonCreateRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrainCreateRequest {

    private Long locomotiveId;
    private List<WagonCreateRequest> wagonsList;
}

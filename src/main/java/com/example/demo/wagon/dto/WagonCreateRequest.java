package com.example.demo.wagon.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WagonCreateRequest {
    private Long id;
    private Integer load;
}

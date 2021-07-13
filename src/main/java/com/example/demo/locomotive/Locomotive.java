package com.example.demo.locomotive;


import com.example.demo.wagon.Wagon;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity(name = "Locomotive")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Locomotive {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "engine_power")
    private String engine_power;

    @Column(name = "max_load")
    private String max_load;

    @Column(name = "locomotive_name")
    private String locomotive_name;

}

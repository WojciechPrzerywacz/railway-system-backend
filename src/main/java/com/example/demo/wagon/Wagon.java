package com.example.demo.wagon;

import com.example.demo.locomotive.Locomotive;
import com.example.demo.trains.Train;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "wagon")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Wagon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "type")
    private String type;

    @Column(name = "max_load")
    private Integer max_load;

    @Column(name = "load_weight")
    private Integer load_weight;

}

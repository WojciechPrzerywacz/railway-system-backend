package com.example.demo.passages;

import com.example.demo.trains.Train;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Passages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(unique=true)
    private String passageName;

    @Column(name = "start")
    private String start;

    @Column(name = "destination")
    private String destination;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "train_id", referencedColumnName = "id")
    private Train train;
//kaskada
}

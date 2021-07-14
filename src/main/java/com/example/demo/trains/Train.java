package com.example.demo.trains;

import com.example.demo.locomotive.Locomotive;
import com.example.demo.wagon.Wagon;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "train")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Train {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "locomotive_id")
    private Locomotive locomotive;

    @ToString.Exclude
    @ManyToMany(targetEntity=Wagon.class,cascade = CascadeType.ALL,
            fetch = FetchType.EAGER)
    private List<Wagon> wagons;
}

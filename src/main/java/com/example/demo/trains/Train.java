package com.example.demo.trains;

import com.example.demo.locomotive.Locomotive;
import com.example.demo.wagon.Wagon;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity(name = "Train")
@Data
@NoArgsConstructor
@AllArgsConstructor
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

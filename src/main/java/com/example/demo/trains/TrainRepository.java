package com.example.demo.trains;

import com.example.demo.trains.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface TrainRepository extends JpaRepository<Train, Long> {
}


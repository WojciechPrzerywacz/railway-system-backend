package com.example.demo.wagon;

import com.example.demo.wagon.Wagon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WagonRepository extends JpaRepository<Wagon, Long> {
}

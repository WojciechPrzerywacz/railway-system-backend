package com.example.demo.locomotive;

import com.example.demo.locomotive.Locomotive;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocomotiveRepository extends JpaRepository<Locomotive, Long> {
}

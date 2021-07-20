package com.example.demo.passages;

import com.example.demo.passages.Passages;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PassagesRepository extends JpaRepository<Passages, Long> {
    List<Passages> findByPassageName(String passageName);
}

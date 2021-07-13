package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @Bean
//    CommandLineRunner commandLineRunner(WagonRepository wagonRepository){
//        return  args -> {
//            Lokomotywa silnaLokomotywa = new Lokomotywa("5000kM", "1000000 kg");
//            Wagon naWegiel = new Wagon("weglowy","1000m3", "80000 kg", "70000 kg");
//            wagonRepository.save(naWegiel);
//            //wagonRepository.delete(naWegiel);
//        };
//    }
//
//    @Bean
//    CommandLineRunner commandLineRunner2( LokomotywaRepository lokomotywaRepository){
//        return  args -> {
//            Lokomotywa silnaLokomotywa = new Lokomotywa("5000kM", "1000000 kg");
//            lokomotywaRepository.save(silnaLokomotywa);
//        };
//    }
}

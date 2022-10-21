/*
package com.example.flight.InitialData;

import com.example.flight.Repository.FlightRepository;
import com.example.flight.model.FlightData;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


public class InitialDataFlight {

    @Configuration
    public class PostConfig {
        @Bean
        CommandLineRunner commandLineRunner(FlightRepository repository) {
            return args -> {
                FlightData post1 = new FlightData(1,"Munich","Berlin","Cadiz");
                repository.save(post1);
                System.out.println("YII");
            };
        }
    }

}
*/
package com.example.flight;

import com.example.flight.Repository.FlightRepository;
import com.example.flight.Service.FlightService;
import com.example.flight.model.FlightData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class FlightApplication implements CommandLineRunner {

	@Autowired
	FlightService flightService;

	public static void main(String[] args) {
		SpringApplication.run(FlightApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		FlightData firstFlight = new FlightData(1,"Sevilla","Berlin", "Cadiz");
		flightService.saveFlightData(firstFlight);

	}

}

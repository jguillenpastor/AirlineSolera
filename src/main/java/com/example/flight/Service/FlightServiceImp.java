package com.example.flight.Service;

import com.example.flight.Repository.FlightRepository;
import com.example.flight.model.FlightData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightServiceImp implements FlightService{
    @Autowired
    private FlightRepository flightRepository;

    @Override
    public FlightData saveFlightData(FlightData flightData){
        return  flightRepository.save(flightData);
    }

    @Override
    public List<FlightData> getAllFlightData(){
        return flightRepository.findAll();
    }

}

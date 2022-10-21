package com.example.flight.Service;

import com.example.flight.model.FlightData;

import java.util.List;

public interface FlightService {
    public FlightData saveFlightData(FlightData flightData);
    public List<FlightData> getAllFlightData();
}

package com.example.flight.Repository;

import com.example.flight.model.FlightData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository <FlightData,Integer> {

}

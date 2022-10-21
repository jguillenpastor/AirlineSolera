package com.example.flight.Controller;

import com.example.flight.Service.FlightService;
import com.example.flight.model.FlightData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/flight")
@CrossOrigin
public class FlightController {

    @Autowired
    private FlightService flightService;

    @PostMapping("/add")
    public String add(@RequestBody FlightData flightData){
        flightService.saveFlightData(flightData);
        return "New data added";
    }

    @GetMapping("/getAll")
    public List<FlightData> getAllStudents(){
        return flightService.getAllFlightData();
    }

    @GetMapping("/agePrices")
    public List<Integer> getAgesPrices(){
        List<Integer> list = Arrays.asList(0, 20,30);
        return  list;
    }

}

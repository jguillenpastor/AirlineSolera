package com.example.flight;

import com.example.flight.Service.FlightServiceImp;
import com.example.flight.model.FlightData;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class FlightApplicationTests {

    @Autowired
    FlightServiceImp flightServiceImp;

    @Test
    public void testBankAdd() {
        FlightData transaction = new FlightData();
        flightServiceImp.saveFlightData(transaction);
        org.testng.Assert.assertNotNull(flightServiceImp.getAllFlightData().get(0));
    }

    @Test
    public void testBankId() {
        FlightData f1 = new FlightData(1,"1","2","3");
        FlightData f2 = new FlightData(1,"1","2","3");
        flightServiceImp.saveFlightData(f1);
        org.testng.Assert.assertEquals(f2.getId(),flightServiceImp.getAllFlightData().get(0).getId());
    }

    @Test
    public void testBankEmissor() {
        FlightData f1 = new FlightData(1,"1","2","3");
        FlightData f2 = new FlightData(1,"1","2","3");
        flightServiceImp.saveFlightData(f1);
        org.testng.Assert.assertEquals(f2.getDestination1(),flightServiceImp.getAllFlightData().get(0).getDestination1());
    }

    @Test
    public void testBankReceptor() {
        FlightData f1 = new FlightData(1,"1","2","3");
        FlightData f2 = new FlightData(1,"1","2","3");
        flightServiceImp.saveFlightData(f1);
        org.testng.Assert.assertEquals(f2.getDestination2(),flightServiceImp.getAllFlightData().get(0).getDestination2());
    }

    @Test
    public void testBankTransaction() {
        FlightData f1 = new FlightData(1,"1","2","3");
        FlightData f2 = new FlightData(1,"1","2","3");
        flightServiceImp.saveFlightData(f1);
        org.testng.Assert.assertEquals(f2.getDestination3(),flightServiceImp.getAllFlightData().get(0).getDestination3());
    }


}

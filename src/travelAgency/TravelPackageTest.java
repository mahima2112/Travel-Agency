package travelAgency;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class TravelPackageTest {

    @Test
    public void testEnrollPassenger() {
        TravelPackage travelPackage = new TravelPackage("Summer Getaway", 50);
        Passenger passenger = new Passenger("Alice", 1, "Standard", 100.0);

        boolean result = travelPackage.enrollPassenger(passenger);

        assertTrue(result);
        assertEquals(1, travelPackage.passengers.size());
    }

    @Test
    public void testAddDestination() {
    	TravelPackage travelPackage = new TravelPackage("Summer Getaway", 50);
    	Destination destination = new Destination("Goa");
    	travelPackage.destinations.add(destination);
    	assertEquals(1, travelPackage.destinations.size());
    	
    }
}


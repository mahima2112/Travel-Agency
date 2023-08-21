package travelAgency;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class ActivityTest {
	
	public void testAddPassenger() {
		Passenger passenger = new Passenger("abc", 123, "gold", 50.0);
		int capacity = 1;
		Activity act = new Activity("Scuba Diving", "", 4500.0, 2, null);
		List<Passenger> passengers = new ArrayList<>();
		passengers.add(passenger);
		act.enrollPassenger(passenger);
		
		assertEquals(1, passenger.activities.size());
		
	}

}

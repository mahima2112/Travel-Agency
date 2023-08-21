package travelAgency;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class DestinationTest {
	
	public static void testAddActivity() {
		List<Activity> activities = new ArrayList<>();
		Activity act = new Activity("Sky Dive", "", 5000.0, 1, null);
		activities.add(act);
		assertEquals(1, activities.size());
	}

}

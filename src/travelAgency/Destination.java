package travelAgency;

import java.util.ArrayList;
import java.util.List;

public class Destination {
	String name;
    List<Activity> activities;

    Destination(String name) {
        this.name = name;
        activities = new ArrayList<>();
    }

    void addActivity(Activity activity) {
        activities.add(activity);
    }

}

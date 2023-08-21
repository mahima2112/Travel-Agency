package travelAgency;

import java.util.ArrayList;
import java.util.List;

public class Passenger {
	String name;
    int passengerNumber;
    String passengerType;
    double balance;
    List<Activity> activities;

    Passenger(String name, int passengerNumber, String passengerType, double balance) {
        this.name = name;
        this.passengerNumber = passengerNumber;
        this.passengerType = passengerType;
        this.balance = balance;
        activities = new ArrayList<>();
    }

    boolean deductBalance(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

}

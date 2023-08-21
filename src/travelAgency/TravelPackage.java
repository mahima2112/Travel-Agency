package travelAgency;

import java.util.ArrayList;
import java.util.List;

public class TravelPackage {

	String name;
    int passengerCapacity;
    List<Destination> destinations;
    List<Passenger> passengers;

    TravelPackage(String name, int passengerCapacity) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        destinations = new ArrayList<>();
        passengers = new ArrayList<>();
    }

    void addDestination(Destination destination) {
        destinations.add(destination);
    }

    boolean enrollPassenger(Passenger passenger) {
        if (passengers.size() < passengerCapacity) {
            passengers.add(passenger);
        }
        return true;
    }

    void printItinerary() {
        System.out.println("Travel Package: " + name);
        for (Destination destination : destinations) {
            System.out.println("Destination: " + destination.name);
            for (Activity activity : destination.activities) {
                System.out.println("Activity: " + activity.name);
                System.out.println("Description: " + activity.description);
                System.out.println("Cost: " + activity.cost);
                System.out.println("Capacity: " + activity.capacity);
            }
        }
    }

    void printPassengerList() {
        System.out.println("Passenger List for Travel Package: " + name);
        System.out.println("Passenger Capacity: " + passengerCapacity);
        System.out.println("Number of Passengers Enrolled: " + passengers.size());
        for (Passenger passenger : passengers) {
            System.out.println("Passenger: " + passenger.name + " Passenger Number: " + passenger.passengerNumber);
        }
    }

    void printIndividualPassengerDetails(Passenger passenger) {
        System.out.println("Passenger Details");
        System.out.println("Name: " + passenger.name);
        System.out.println("Passenger Number: " + passenger.passengerNumber);
        if (!passenger.passengerType.equals("Premium")) {
            System.out.println("Balance: " + passenger.balance);
        }
        System.out.println("Enrolled Activities:");
        for (Activity activity : passenger.activities) {
            System.out.println("Activity: " + activity.name);
            System.out.println("Destination: " + activity.destination.name);
            System.out.println("Price Paid: " + (passenger.passengerType.equals("Gold") ? activity.cost * 0.9 : activity.cost));
        }
    }

    void printAvailableActivities() {
        System.out.println("Available Activities:");
        for (Destination destination : destinations) {
            for (Activity activity : destination.activities) {
                if (activity.passengers.size() < activity.capacity) {
                    System.out.println("Activity: " + activity.name);
                    System.out.println("Destination: " + destination.name);
                    System.out.println("Spaces Available: " + (activity.capacity - activity.passengers.size()));
                }
            }
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Destination destination = new Destination("Paradise Island");
        Activity activity1 = new Activity("Sightseeing Tour", "Guided city tour", 50.0, 15, destination);
        Activity activity2 = new Activity("Beach Day", "Relax on the beach", 30.0, 20, destination);
        destination.addActivity(activity1);
        destination.addActivity(activity2);

        TravelPackage pkg = new TravelPackage("Summer Getaway", 50);
        pkg.addDestination(destination);

        Passenger passenger1 = new Passenger("Alice", 1, "Standard", 100.0);
        Passenger passenger2 = new Passenger("Bob", 2, "Gold", 200.0);
        Passenger passenger3 = new Passenger("Charlie", 3, "Premium", 0.0);
        pkg.enrollPassenger(passenger1);
        pkg.enrollPassenger(passenger2);
        pkg.enrollPassenger(passenger3);

        activity1.enrollPassenger(passenger1);
        activity1.enrollPassenger(passenger2);
        activity2.enrollPassenger(passenger2);
        activity2.enrollPassenger(passenger3);

        pkg.printItinerary();
        pkg.printPassengerList();
        pkg.printIndividualPassengerDetails(passenger2);
        pkg.printAvailableActivities();

	}
}

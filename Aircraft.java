/**
 * Aircraft Class
 * Author: PRANAV ASHOK CHAUDHARI
 * Date: 26-11-2023
 * Assignment: 1
 * Purpose: Defines the Aircraft class, representing an aircraft with type, maintenance state, flight state, and a list of pilots.
 */

import java.util.ArrayList;

public class Aircraft {
    // Instance variables
    private String type; // Type of the aircraft
    private MaintenanceState maintenanceState; // Maintenance state of the aircraft
    private FlightState flightState; // Flight state of the aircraft
    private static ArrayList<Pilots> pilots; // List of pilots associated with the aircraft

    // Constructor
    public Aircraft(String type, MaintenanceState maintenanceState, FlightState flightState, ArrayList<Pilots> pilots) {
        this.type = type;
        this.maintenanceState = maintenanceState;
        this.flightState = flightState;
        this.pilots = pilots;
    }

    // Getter and setter methods
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public MaintenanceState getMaintenanceState() {
        return maintenanceState;
    }

    public void setMaintenanceState(MaintenanceState maintenanceState) {
        this.maintenanceState = maintenanceState;
    }

    public FlightState getFlightState() {
        return flightState;
    }

    public void setFlightState(FlightState flightState) {
        this.flightState = flightState;
    }

    public ArrayList<Pilots> getPilots() {
        return pilots;
    }

    // Method to add a pilot to the list
    public void joinPilot(Pilots pilot) {
        this.pilots.add(pilot);
    }

    // Static method to print the list of pilots
    public static void printPilots() {
        System.out.println("Pilots working on this aircraft:");
        for (Pilots pilot : pilots) {
            System.out.println("Name: " + pilot.getName() + ", ID: " + pilot.getID() + ", Position: " + pilot.getRole());
        }
    }

    // Override equals method for comparing aircraft based on type
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Aircraft aircraft = (Aircraft) obj;
        return type.equals(aircraft.type);
    }

    // Override toString method for displaying detailed information about the aircraft
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("\n"+
                "Type: " + type + "\n" +
                "MaintenanceState: " + maintenanceState + "\n" +
                "FlightState: " + flightState);
        
        if (!pilots.isEmpty()) {
            result.append("\nCrew Info:");
            for (Pilots pilot : pilots) {
                result.append("\nName: ").append(pilot.getName()).append(", ID: ").append(pilot.getID()).append(", Position: ").append(pilot.getRole());
            }
        }

        return result.toString();
    }
}

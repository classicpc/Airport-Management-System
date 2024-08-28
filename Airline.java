/**
 * Airline Class
 * Author: PRANAV ASHOK CHAUDHARI
 * Date: 26-11-2023
 * Assignment: 1
 * Purpose: Defines the Airline class, representing an airline with a name, a list of flights, and a list of owned aircraft.
 */

import java.util.Date;
import java.util.ArrayList;

public class Airline {
    // Instance variables
    private String name; // Name of the airline
    private ArrayList<Flight> flights; // List of flights owned by the airline
    private ArrayList<Aircraft> aircrafts; // List of aircraft owned by the airline

    // Constructor
    public Airline(String name, ArrayList<Flight> flights, ArrayList<Aircraft> aircrafts) {
        this.name = name;
        this.flights = flights;
        this.aircrafts = aircrafts;
    }

    // Getter and setter methods for name, flights, and aircrafts
    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public ArrayList<Flight> getFlights() {
        return flights;
    }

    
    public void setFlights(ArrayList<Flight> flights) {
        this.flights = flights;
    }

    
    public ArrayList<Aircraft> getAircrafts() {
        return aircrafts;
    }

    
    public void setAircrafts(ArrayList<Aircraft> aircrafts) {
        this.aircrafts = aircrafts;
    }
    // Method to add an aircraft to the list of owned aircraft
    public void owns(Aircraft aircraft) {
        if (!aircrafts.contains(aircraft)) {
            aircrafts.add(aircraft);
        }
    }

    // Method to print information about flights owned by the airline
    public void printFlightsByName() {
        System.out.println("Flights owned by this airline:");
        for (Flight flight : flights) {
            System.out.println(flight.toString());
        }
    }

    // Method to get a list of all pilots working for the airline
    public ArrayList<Pilots> pilotsWorkingForAirlines() {
        ArrayList<Pilots> allPilots = new ArrayList<>();
        for (Aircraft a : aircrafts) {
            allPilots.addAll(a.getPilots());
        }
        return allPilots;
    }

    // Method to get a list of departure flights from a specific airport on a given date
    public ArrayList<Flight> getDepartureFlightsByAirport(Airport departureAirport, Date date) {
        ArrayList<Flight> departureFlights = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getDepartureAirport().equals(departureAirport) && flight.getDepartureTime().equals(date)) {
                departureFlights.add(flight);
            }
        }
        return departureFlights;
    }

    // Method to get a list of arrival flights at a specific airport on a given date
    public ArrayList<Flight> getArrivalFlightsByAirport(Airport arrivalAirport, Date date) {
        ArrayList<Flight> arrivalFlights = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getArrivalAirport().equals(arrivalAirport) && flight.getArrivalTime().equals(date)) {
                arrivalFlights.add(flight);
            }
        }
        return arrivalFlights;
    }
}

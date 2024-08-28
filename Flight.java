/**
 * Flight Class
 * Author: PRANAV ASHOK CHAUDHARI
 * Date: 26-11-2023
 * Assignment: 1
 * Purpose: Defines the Flight class, representing a flight with an ID, departure and arrival times, departure and arrival airports, and the assigned aircraft.
 */

import java.util.Date;

public class Flight {
    // Instance variables
    private String id; // Unique identifier for the flight
    private Date departureTime; // Time of departure
    private Date arrivalTime; // Time of arrival
    private Airport departureAirport; // Departure airport
    private Airport arrivalAirport; // Arrival airport
    private Aircraft aircraft; // Aircraft assigned to the flight

    // Constructor
    public Flight(String id, Date departureTime, Date arrivalTime, Airport departureAirport, Airport arrivalAirport, Aircraft aircraft) {
        this.id = id;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.aircraft = aircraft;
        System.out.println("FLIGHT INFORMATION:" + "\n" + "ID: " + this.id + "\n" + "Departure Time: " + this.departureTime + "\n" + "Arrival Time: " + this.arrivalTime + "\n" + "Departure Airport: " + this.departureAirport + "\n" + "Arrival Airport: " + this.arrivalAirport + "\n" + "Aircraft: " + this.aircraft);
    }

    // Getter and setter methods for id, departureTime, arrivalTime, departureAirport, arrivalAirport, and aircraft
        
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

   
    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(Airport departureAirport) {
        this.departureAirport = departureAirport;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(Airport arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    // String representation of the Flight object
    @Override
    public String toString() {
        return "Flight ID: " + id + "\n" + ", Departure Time: " + departureTime + "\n" + ", Arrival Time: " + arrivalTime
                + "\n" + ", Departure Airport: " + departureAirport.getName() + "\n" + ", Arrival Airport: " + arrivalAirport.getName()
                + "\n" + ", Aircraft Type: " + aircraft.getType();
    }
}

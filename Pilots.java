/**
 * Pilots Class
 * Author: PRANAV ASHOK CHAUDHARI
 * Date: 26-11-2023
 * Assignment: 1
 * Purpose: Defines the Pilots class, representing a pilot with a name, ID, and role.
 */
public class Pilots {
    // Instance variables
    private String name;    // Name of the pilot
    private int id;         // ID of the pilot
    private String role;    // Role of the pilot 

    // Constructor
    public Pilots(String name, int id, String role) {
        this.name = name;
        this.id = id;
        this.role = role;
    }

    // Getter and setter methods for name, id, and role

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // toString method to represent the Pilots object as a String
    @Override
    public String toString() {
        return "Pilot: [Name=" + name + ", ID=" + id + ", Role=" + role + "]";
    }

    public boolean isPilotForFlight(Aircraft aircraft) {
        for (Pilots pilot : aircraft.getPilots()) {
            if (this.equals(pilot)) {
                return true; // Pilot is working for a flight in this aircraft
            }
        }
        return false; // Pilot is not working for any flight in this aircraft
    }
}

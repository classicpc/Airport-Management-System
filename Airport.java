/**
 * Airport Class
 * Author: PRANAV ASHOK CHAUDHARI
 * Date: 26-11-2023
 * Assignment: 1
 * Purpose: Defines the Airport class, representing an airport with a name, country, and code.
 */
public class Airport {
    // Instance variables
    private String name;    // Name of the airport
    private String country; // Country where the airport is located
    private String code;    // Airport code

    // Constructor
    public Airport(String name, String country, String code) {
        this.name = name;
        this.country = country;
        this.code = code;

        // Print airport information
        System.out.println("AIRPORT CITY, COUNTRY, AND CODE IS:");
        System.out.println(this.name + " " + this.country + " " + this.code);
    }

    // Getter and setter methods for name, country, and code

   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    // toString method to represent the Airport object as a String
    @Override
    public String toString() {
        return name;  // Modify this line to print the desired information
    }
}

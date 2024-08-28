# Airport Management System

This repository houses the Java code for an airport management system, developed as an assignment for SOFE 2710U Object-Oriented Programming and Design (Fall 2023). The system offers comprehensive functionalities for managing flights, airlines, pilots, and airports.

Overview

Streamline airport operations: Manage flight schedules, airline fleets, pilot assignments, and airport traffic efficiently.
Object-oriented design principles: Leverage the power of object-oriented programming for a modular and maintainable codebase.

Key Features

Manage Aircraft:
Assign pilots to aircraft using joinPilot(Pilot pilot).
View all pilots associated with an aircraft using printPilot().
Manage Airlines:
Add aircraft to an airline's fleet with owns(Aircraft aircraft).
Display all flights owned by an airline with printFlightByName().
Retrieve a list of pilots working for a specific airline using pilotsWorkingForAirlines(Airline airline).
Obtain a list of departing flights from a particular airport on a given date with getDeparureFlightByAirport(Airport airport).
Find arriving flights at a specific airport on a given date with getArrivalFlightByAirport(Airport airport).
Manage Pilots:
Verify if a pilot is assigned to any flight using the specified aircraft with isPilotForFlight(Aircraft aircraft).

Prerequisites:

Java Development Kit (JDK)
Integrated Development Environment (IDE) (e.g., Eclipse, IntelliJ IDEA, NetBeans) or a text editor (e.g., Notepad++, VSCode)
Instructions:

Clone the Repository:
git clone https://github.com/your-username/airport-system.git
cd airport-system

Compile the Code:
Use your preferred IDE to import the project and compile the code.
Alternatively, compile from the command line:
javac *.java

Run the Application:
Execute the main class to launch the application. Specify the main class name in the command line:
java MainClass

Class Breakdown

Aircraft: Models an aircraft, including attributes and methods for managing pilots.
Airline: Manages a collection of flights and aircraft, providing methods for querying and management.
Pilot: Represents a pilot with methods to check flight assignments.
Flight: Encapsulates flight details like departure, arrival, and crew.
Airport: Represents an airport with methods to query flights.
File Structure

/src
  /main/java
    /com/yourpackage (replace with your actual package name)
      Aircraft.java
      Airline.java
      Pilot.java
      Flight.java
      Airport.java
      MainClass.java
/README.md

# Airport-Management-System

This repository contains the Java code for an airport management system, designed as an assignment for SOFE 2710U Object-Oriented Programming and Design (Fall 2023). The code implements various functionalities related to managing flights, airlines, pilots, and airports.

Requirements
The system consists of several classes with specific functionalities:

1. Aircraft Class:

joinPilot(Pilot pilot): Assigns a pilot to the aircraft.
printPilot(): Lists all pilots associated with the aircraft.

2. Airline Class:

owns(Aircraft aircraft): Adds an aircraft to the airline's fleet (if not already owned).
printFlightByName(): Displays a list of all flights owned by the airline.
pilotsWorkingForAirlines(Airline airline): Returns a list of pilots working for the specified airline.
getDeparureFlightByAirport(Airport airport): Retrieves a list of departing flights from a specific airport on a given date.
getArrivalFlightByAirport(Airport airport): Retrieves a list of arriving flights at a specific airport on a given date.

3. Pilot Class:

isPilotForFlight(Aircraft aircraft): Checks if the pilot is assigned to any flight using the specified aircraft.
Setup and Execution

Prerequisites

Java Development Kit (JDK)
An Integrated Development Environment (IDE) like Eclipse, IntelliJ IDEA, or NetBeans (or a text editor like Notepad++ or VSCode)

Instructions

Clone the Repository

git clone https://github.com/your-username/airport-system.git
cd airport-system

Compile the Code

Use your preferred IDE to import the project and compile the code.

Alternatively, compile from the command line:

javac *.java


Run the Application
Run the main class to execute the application. In the command line, specify the main class name:

Bash
java MainClass
Use code with caution.

Classes Overview

Aircraft: Represents an aircraft with attributes and methods to manage pilots.
Airline: Manages a collection of flights and aircraft, providing methods for querying and management.
Pilot: Represents a pilot with methods to check flight assignments.
Flight: Represents a flight with details about departure, arrival, and crew.
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

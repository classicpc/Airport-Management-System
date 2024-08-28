 /*
	SOFE 2710 Assignment 2 
	
 */

 

import java.util.*;
import java.text.*;


/**
 *
 * @author  
 */
 
 
 
public class AirportTest {

    public static void main(String[] args)throws ParseException {
        // TODO code application logic here
		
	   //instantiate objects from Airport class
       Airport pearson = new Airport("Toronto","Canada","YYZ");
	   Airport montreal = new Airport("Montreal","Canada","YUL");
	   Airport ottawa = new Airport("Ottawa","Canada","YOW");	 
	   
	   //instantiate objects from Pilots class
	   Pilots johnSmith = new Pilots ("John Smith",540,"Captain");
	   Pilots SarahEric = new Pilots ("Sarah Eric",651,"CoPilot");
	   Pilots monnaKam = new Pilots ("Monna Kam",785,"Navigator");
	 	   
      //instantiate objects from Aircraft class	
		ArrayList<Pilots> pilots = new ArrayList<Pilots>();
		pilots.add(johnSmith);
		pilots.add(SarahEric);
		pilots.add(monnaKam);	
		Aircraft boeing787 = new Aircraft("boeing787", MaintenanceState.Working ,FlightState.landed, pilots);
	
	//instantiate objects from Flight class  
	 SimpleDateFormat dateformat = new SimpleDateFormat("MM/dd/yyyy HH:mm");	  
	 Date departureTime = dateformat.parse("07/17/2018 03:19");
     Date arrivalTime = dateformat.parse("07/20/2018 04:50");	 
     Flight ac472 = new Flight("AC472",departureTime,arrivalTime,pearson,ottawa,boeing787);      
		
	//instantiate objects from Airline class  	 
    ArrayList<Flight> flights= new ArrayList<Flight>(); 
	flights.add(ac472);	
	ArrayList<Aircraft> aircrafts= new  ArrayList<Aircraft>(); 
	aircrafts.add(boeing787);	
	Airline airCanada = new Airline("Air Canada",flights,aircrafts);
    
  }  
    
}

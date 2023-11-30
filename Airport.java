// Question 19

import java.util.*;

public class Airport {
  
  public ArrayList<Flight> allFlights;

  /*
  Immediately below is the constructor method for the Airport class.
  This was not asked for. I include it only so that the methods
  you were asked to write can be tested.
  */
  public Airport(ArrayList<Flight> flights) {
    this.allFlights = flights;
  }

  /*
  The main method constructs the Flights and the Airport
  described in the question, and calls getTotalRevenue and
  updateFlights on the contructed Airport.
  */
  public static void main(String[] args) {
    // f1 - f4 are the Flights described in the question 19.
    Flight f1 = new Flight(25, 50, 30);
    Flight f2 = new Flight(10, 100.5, 60);
    Flight f3 = new Flight(50, 200, 40);
    Flight f4 = new Flight(20, 100, 120);
    ArrayList<Flight> flights = new ArrayList<Flight>();
    flights.add(f1);
    flights.add(f2);
    flights.add(f3);
    flights.add(f4);
    Airport myAirport = new Airport(flights);
    System.out.println(myAirport.getTotalRevenue());
    // Uncomment the line below when updateFlights has been written.
    // It will print the number of flights that were removed.
    // System.out.println(myAirport.updateFlights());
  }

  /*
  Below is the answer to part a.
  Note that it is an instance method. This means that
  it is called with the anAirport.getTotalRevenue() syntax.
  Since it is an instance method, we do not include static in its header.
  The allFlights variable is an instance variable.
  It is the allFlights variable associated with the Airport
  on which getTotalRevenue is called. We could use this.allFlights
  instead, but it is not necessary.
  */
  public double getTotalRevenue() {
    double totalRev = 0;
    for (Flight f: allFlights) {
      if (f.getNumPassengers() > f.getCapacity()) {
        totalRev += f.getPrice() * f.getCapacity();
      } else {
        totalRev += f.getPrice() * f.getNumPassengers();
      }
    }
    return totalRev;
  }
  
  // public int updateFlights() {
  // Insert the code for part b.
  // }
  
}
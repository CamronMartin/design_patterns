package iterator;

import java.util.Iterator;
import java.util.ArrayList;

/**
 * This class will be responsible for checking whether there is 
 * a next flight or not, and if there is, it will tell you 
 * the next flight.
 * @author Camron Martin
 */
public class FlightIterator implements Iterator {

  private ArrayList<Flight> flights;   
  private int position = 0;
  private Airport from;
  private Airport to;

  /**
   * Constructor that will create the flight iterator.
   * @param flights a list of available flights 
   * @param from starting location 
   * @param to ending location
   */
  public FlightIterator(ArrayList<Flight> flights, Airport from, Airport to){
    this.flights = flights;
    this.from = from;
    this.to = to;
  }

  /**
   * Method to check whether there is a next item in the list 
   * @return boolean if there is a next item.
   */
  public boolean hasNext() { 

    while (position < flights.size()) {
      Flight flight = flights.get(position);
      if (flight.getFrom().equals(from) && flight.getTo().equals(to)) {
        return true;
      }
      position++;
    }
    return false;

  }

  /**
   * Method that will return the next flight in the list.
   * @return flight the next flight.
   */
  public Flight next() {

    if(!hasNext()){
      return null;
    }
    return flights.get(position++);

  }
}

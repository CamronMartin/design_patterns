package iterator;

import java.util.Iterator;
import java.util.ArrayList;

public class FlightIterator implements Iterator {

  private ArrayList<Flight> flights;   
  private int position = 0;
  private Airport from;
  private Airport to;

  public FlightIterator(ArrayList<Flight> flights, Airport from, Airport to){
    this.flights = flights;
    this.from = from;
    this.to = to;
  }
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
  public Flight next() {

    if(!hasNext()){
      return null;
    }
    return flights.get(position++);

  }
}

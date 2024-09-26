package iterator;

import java.util.Iterator;
import java.util.ArrayList;

public class FlightIterator implements Iterator {

  private ArrayList<Flight> flights;
  private int position = 0;
  private Airport from;
  private Airport to;

  public FlightIterator(ArrayList<Flight> flights, Airport from, Airport to){
    flights = new ArrayList<>();
    this.from = from;
    this.to = to;
  }
  public boolean hasNext() { 
    return flights.get(position) != null && position < flights.size();
  }
  public Flight next() {
    if(!hasNext()){
      return null;
    }
    return flights.get(position++);
  }
}

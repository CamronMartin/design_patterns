package iterator;
import java.util.ArrayList;


public class Airline {

  private String title;
  private ArrayList<Flight> flights;

  public Airline(String title) {
    this.title = title;
    flights = new ArrayList<>();
  }

  public String getTitle(){
    return this.title;
  }

  public FlightIterator createIterator(String fromCode, String toCode) {

    // Get String fromCode to Airport fromCode but how??
    Airport fromA = Airport.valueOf(fromCode); 
    Airport toA = Airport.valueOf(toCode);
    return new FlightIterator(FlightLoader.getFlights(), fromA, toA);
  }

} 

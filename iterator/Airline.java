package iterator;
import java.util.ArrayList;

/**
 * This class will be responsible for creating the iterator 
 * to cycle through flights.
 * @author Camron Martin
 */
public class Airline {

  private String title;
  private ArrayList<Flight> flights;

  /**
   * This constructor will instansiate a new flight list, 
   * and create a title.
   * @param title A string title for the airline 
   */
  public Airline(String title) {
    this.title = title;
    flights = new ArrayList<>();
  }

  /**
   * A getter method to return the title of 
   * the airline 
   * @return title of the airline 
   */
  public String getTitle(){
    return this.title;
  }

  /**
   * This method will create an iterator to find the 
   * from code and the to code that is provided by 
   * the user 
   * @param fromCode the Airport code they are coming from 
   * @param toCode the Airport code they are going to 
   * @return new flightIterator 
   */
  public FlightIterator createIterator(String fromCode, String toCode) {
    
    try {
      Airport fromA = Airport.valueOf(fromCode); 
      Airport toA = Airport.valueOf(toCode);
      
      return new FlightIterator(FlightLoader.getFlights(), fromA, toA);
    } catch(IllegalArgumentException e) {
      System.out.println("Invalid airport code: " + e.getMessage());
      System.exit(1);
    } 
    return null; 
  }
} 


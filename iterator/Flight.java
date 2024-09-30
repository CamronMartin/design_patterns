package iterator;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 * This will class will create a new flight and print 
 * a string representation of a flight. 
 * @author Camron Martin 
 */
public class Flight {

  private String flightNum;
  private Airport from;
  private Airport to;
  private LocalTime startTime;
  private LocalTime endTime;
  private int numTransfers;

  /**
   * This constructor will create a new flight with times, 
   * location, and number of transfers 
   * @param flightNum number of flight 
   * @param from where you are coming from 
   * @param to where you are going to 
   * @param startTime start time for the flight 
   * @param endTime end time for the flight 
   * @param numTransfers numbers of transfers for entire flight 
   */
  public Flight(String flightNum, Airport from, Airport to, LocalTime startTime, LocalTime endTime, int numTransfers) {
    this.flightNum = flightNum;
    this.from = from;
    this.to = to;
    this.startTime = startTime;
    this.endTime = endTime;
    this.numTransfers = numTransfers;
   
  }

  /**
   * Method to return where you are coming from 
   * @return from location 
   */
  public Airport getFrom() {
    return this.from;
  }

  /**
   * Method to return where you are going to 
   * @return destination  
   */
  public Airport getTo() {
    return this.to;
  }

  /**
   * Method to check whether or not the from and to locations 
   * are the same 
   * @return boolean of whether or not they are the same
   */ 
  public boolean sameLoc(Airport from, Airport to) {
    return this.from.equals(from) && this.from.equals(to);
  }

  /**
   * This method will print a string representation 
   * of the flight list according to the flight loader 
   * @return string representation of available flights
   */
  @Override
  public String toString() {

    StringBuilder sb = new StringBuilder();

    java.time.Duration duration = java.time.Duration.between(startTime, endTime);

    double hours = duration.toHours();
    double mins = duration.toMinutes() % 60;

    sb.append(this.from + " to " + this.to + " ");
    sb.append(this.startTime + " - " + this.endTime + " ");
    sb.append("(" + hours + "h " + mins + "m) ");
    
    // TODO: Implement method 
    if (this.numTransfers == 0) {
        sb.append("Direct Flight");
    } else if (this.numTransfers == 1) {
        sb.append("1 Stopover");
    } else {
        sb.append(this.numTransfers + " Transfers");
    }

    return sb.toString(); 
  }
} 

package iterator;
import java.time.LocalTime;
import java.util.ArrayList;

public class Flight {

  private String flightNum;
  private Airport from;
  private Airport to;
  private LocalTime startTime;
  private LocalTime endTime;
  private int numTransfers;

  public Flight(String flightNum, Airport from, Airport to, LocalTime startTime, LocalTime endTime, int numTransfers) {
    this.flightNum = flightNum;
    this.from = from;
    this.to = to;
    this.startTime = startTime;
    this.endTime = endTime;
    this.numTransfers = numTransfers;
  }

  public Airport getFrom() {
    return this.from;
  }

  public Airport getTo() {
    return this.to;
  }

  public boolean sameLoc(Airport from, Airport to) {
    return from == to;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    ArrayList<Flight> flights = FlightLoader.getFlights();
    sb.append(this.from + " to " + this.to + " " + this.startTime + " - " + this.endTime + " (" + (endTime.minus(startTime)) + ") ");
  }
} 

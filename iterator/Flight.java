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
    return this.from.equals(from) && this.from.equals(to);
  }

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

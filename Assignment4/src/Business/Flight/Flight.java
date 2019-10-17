package Business.Flight;

import Business.Airliner.Fleet.Airplane;
import Business.TravelOffice.Customer.Customer;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;


public class Flight {
    // attributes shows in MasterTravelSchedualJPanel
    // getter/ setter
    // seat manage
    // seat assignment
    
    private Airplane airplane;
    private SeatDirectory seatDirectory;
    private String departure;
    private String destination;
    private LocalDateTime date;
    private LocalDateTime startTime;
    private LocalDateTime arriveTime;
    private double price; 
    private long hours = Duration.between(startTime, arriveTime).toHours();

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    public SeatDirectory getSeatDirectory() {
        return seatDirectory;
    }

    public void setSeatDirectory(SeatDirectory seatDirectory) {
        this.seatDirectory = seatDirectory;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(LocalDateTime arriveTime) {
        this.arriveTime = arriveTime;
    }



    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public long getHours(){
        return hours;
    }
    public void setHours(){
        this.hours = hours;
    }
    
    
    
    
    
    
    public void SeatAssignment(Customer customer, Airplane a ){
        
        
    }
}
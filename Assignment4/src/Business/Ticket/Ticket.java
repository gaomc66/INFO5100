/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Ticket;

import Business.Flight.Flight;
import Business.TravelOffice.Customer.Customer;
import Business.Flight.Seat;
import Business.TravelOffice.TravelOffice;


public class Ticket {
    // interact with the flight.seat / flight.seatAssignment
    // interact with customer
    private Flight flight;
    private Customer customer;
    private Seat seat;
    
    private static int count =0;
    
    // mark which office book this ticket
    private String ticketNumber;
    private String bookOffice;
    private String flightInfo;
    private String seatInfo;
    private String customerInfo;
    private String airplaneInfo;
    
    public Ticket(Flight flight, Customer customer, String seatNumber, String officeCode){
        this.flight = flight;
        this.customer = customer;
        flight.SeatAssignment(customer, seatNumber);
        
        this.ticketNumber = officeCode + Integer.toString(count ++);
        this.bookOffice = officeCode;
        
    }
}

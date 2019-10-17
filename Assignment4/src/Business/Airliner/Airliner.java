/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airliner;

import Business.Flight.FlightSchedual;
import Business.UserAccount.UserAccount;


public class Airliner {
    // CRUD for Flight
    // one Airliner has one fleet
      
    private String id;
    private String name;
    
    private FlightSchedual flightSchedual;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FlightSchedual getFlightSchedual() {
        return flightSchedual;
    }

    
   
}

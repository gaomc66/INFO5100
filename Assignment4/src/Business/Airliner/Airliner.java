/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airliner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Business.Airliner.Fleet.AirplaneDirectory;
import Business.Airliner.Flight.FlightSchedual;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;


public class Airliner {
    // CRUD for Flight
    // one Airliner has one fleet
      
    private UserAccount userAccount;
    private String id;
    private String name;
    private AirplaneDirectory airplaneDirectory;
    private FlightSchedual flightSchedual;
    private static int count = 1;
    
    public Airliner(){
        this.flightSchedual = new FlightSchedual(this);
        this.airplaneDirectory =new AirplaneDirectory();
//        this.name = name;
        this.id = String.format("%05d", count);
        count ++;
    }
    

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

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

    public AirplaneDirectory getAirplaneDirectory() {
        return airplaneDirectory;
    }

    public void setAirplaneDirectory(AirplaneDirectory airplaneDirectory) {
        this.airplaneDirectory = airplaneDirectory;
    }

    public FlightSchedual getFlightSchedual() {
        return flightSchedual;
    }

    public void setFlightSchedual(FlightSchedual flightSchedual) {
        this.flightSchedual = flightSchedual;
    }
    
    @Override
    public String toString(){
        return this.id;
    }

    public int getFlightsNum(){
        return this.flightSchedual.getFlghtList().size();
    }
    
    public int getAirplaneNum(){
        return this.airplaneDirectory.getAirplaneList().size();
    }
   
}

/*
 * HappyLamb - TravelAgencySystem
 * Each line should be prefixed with  * 
 */
package Business.Airliner.Fleet;

import java.util.ArrayList;

public class AirplaneDirectory {
    private ArrayList<Airplane> airplaneList;
    
    public AirplaneDirectory(){
        this.airplaneList = new ArrayList<Airplane>();
    }
    
    public ArrayList<Airplane> getAirplaneDirectory(){
        return airplaneList;
    }
    
    public Airplane createAirplane(){
        Airplane airplane = new Airplane();
        return airplane;
    }
}

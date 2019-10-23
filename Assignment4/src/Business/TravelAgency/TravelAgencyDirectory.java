/*
 * HappyLamb - TravelAgencySystem
 * Each line should be prefixed with  * 
 */
package Business.TravelAgency;

import java.util.ArrayList;

/**
 *
 * @author gaomc
 */
public class TravelAgencyDirectory {
    
    private ArrayList<TravelAgency> travelAgencyList;
    
    public TravelAgencyDirectory(){
        travelAgencyList = new ArrayList<>();
    }
    
    public ArrayList<TravelAgency> getTavelAgencyList(){
        return travelAgencyList;
    }

}

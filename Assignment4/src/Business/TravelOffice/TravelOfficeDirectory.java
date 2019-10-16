/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.TravelOffice;

import java.awt.List;
import java.util.ArrayList;

public class TravelOfficeDirectory {
    
    private ArrayList<TravelOffice> travelOfficeList;
    
    public TravelOfficeDirectory(){
        travelOfficeList = new ArrayList<>();
    }
    
    public ArrayList<TravelOffice> getTravelOfficList(){
        return travelOfficeList;
    }
    
    public TravelOffice createTravelOffice(){
        TravelOffice travelOffice = new TravelOffice();
        return travelOffice;
    }
    
}

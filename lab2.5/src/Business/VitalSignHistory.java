/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gaomc
 */
public class VitalSignHistory {
    private ArrayList<VitalSigns> vitalSignHistory;
    
    public VitalSignHistory(){
        
        vitalSignHistory = new ArrayList<VitalSigns> ();
    }

    public ArrayList<VitalSigns> getVitalSignHistory() {
        return vitalSignHistory;
    }
    
    public List<VitalSigns> getAbnormalList(double maxBP, double minBP){
        List<VitalSigns> abnList = new ArrayList<>();
        
        for(VitalSigns vs : vitalSignHistory){
            if(vs.getBloodPressure() > maxBP || vs.getBloodPressure() < minBP){
                abnList.add(vs);
            }
        }
        return abnList;
        
    }

    public void setVitalSignHistory(ArrayList<VitalSigns> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
    public VitalSigns addVitals(){
        VitalSigns vs = new VitalSigns();
        vitalSignHistory.add(vs);
        return vs;
    }
    
    public void deleteVitals(VitalSigns v){
        vitalSignHistory.remove(v);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.user.patients;

import business.user.User;
import java.util.ArrayList;

/**
 *
 * @author gaomc
 */
public class Patients extends User{
    

    MedicalRecordsDirectory medicalRecordsDirectory;
    
    public Patients() {
        super("Patients");
    }
    
    public ArrayList<MedicalRecords> getMedicalRecordsDirectory(){
        return this.medicalRecordsDirectory.getRecords();
    }
    
    public void addRecords(MedicalRecords medicalRecords){
        this.medicalRecordsDirectory.getRecords().add(medicalRecords);
    }

    @Override
    public String toString(){
        return this.getName()  + " ; " + this.getUserType();
    }
}

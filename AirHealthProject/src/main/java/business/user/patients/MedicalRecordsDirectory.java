/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.user.patients;

import java.util.ArrayList;

/**
 *
 * @author gaomc
 */
public class MedicalRecordsDirectory {
    private ArrayList<MedicalRecords> records;

    public MedicalRecordsDirectory() {
        this.records = new ArrayList<>();
    }

    public ArrayList<MedicalRecords> getRecords() {
        return records;
    }

//    public void setRecords(ArrayList<PatientsRecords> records) {
//        this.records = records;
//    }
    
    
}

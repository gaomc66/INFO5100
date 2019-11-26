/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.user.patients;

import business.workqueue.others.Reciption;
import java.util.Date;

/**
 *
 * @author gaomc
 */
public class MedicalRecords {
    String serial_number;
    String hospital;
    Date record_Date;
    String illness_details;
    
    // reciption : including medicines
    Reciption reciption;

    public MedicalRecords() {
        
    }

    public Reciption getReciption() {
        return reciption;
    }

    public void setReciption(Reciption reciption) {
        this.reciption = reciption;
    }
    
    public String getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public Date getRecord_Date() {
        return record_Date;
    }

    public void setRecord_Date(Date record_Date) {
        this.record_Date = record_Date;
    }

    public String getIllness_details() {
        return illness_details;
    }

    public void setIllness_details(String illness_details) {
        this.illness_details = illness_details;
    }

    @Override
    public String toString(){
        return this.getSerial_number() + " ; " + this.getIllness_details();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workqueue.others;


import business.user.patients.Patients;
import java.time.LocalDateTime;
import java.util.HashMap;

/**
 *
 * @author gaomc
 */
public class Reciption {
    LocalDateTime reciption_date;
    Patients patient;
    HashMap<String,Integer> reciption_details;
    String reciption_hospital;
    String reciption_doctor;
    
    public Reciption(Patients patient, String hospital, String doctor){
        this.patient = patient;
        this.reciption_hospital = hospital;
        this.reciption_doctor = doctor;
        this.reciption_date = LocalDateTime.now();
    }

    public LocalDateTime getReciption_date() {
        return reciption_date;
    }

    public void setReciption_date(LocalDateTime reciption_date) {
        this.reciption_date = reciption_date;
    }

    public Patients getPatient() {
        return patient;
    }

    public void setPatient(Patients patient) {
        this.patient = patient;
    }

    public HashMap<String, Integer> getReciption_details() {
        return reciption_details;
    }

    public void setReciption_details(HashMap<String, Integer> reciption_details) {
        this.reciption_details = reciption_details;
    }

    public String getReciption_hospital() {
        return reciption_hospital;
    }

    public void setReciption_hospital(String reciption_hospital) {
        this.reciption_hospital = reciption_hospital;
    }

    public String getReciption_doctor() {
        return reciption_doctor;
    }

    public void setReciption_doctor(String reciption_doctor) {
        this.reciption_doctor = reciption_doctor;
    }
    
    
    
}

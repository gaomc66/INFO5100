/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.user.doctor;

import business.user.User;

/**
 *
 * @author gaomc
 */
public class Doctor extends User{
    
    String qulification_number;
    String qulification_type;
    String hospital_info;
    
    public Doctor() {
        super("Doctor");
    }

    public String getQulification_number() {
        return qulification_number;
    }

    public void setQulification_number(String qulification_number) {
        this.qulification_number = qulification_number;
    }

    public String getQulification_type() {
        return qulification_type;
    }

    public void setQulification_type(String qulification_type) {
        this.qulification_type = qulification_type;
    }

    public String getHospital_info() {
        return hospital_info;
    }

    public void setHospital_info(String hospital_info) {
        this.hospital_info = hospital_info;
    }
    
    @Override
    public String toString(){
        return this.getName() + " ; " +this.getQulification_type() + " ; " +this.getHospital_info();
    }
    
}

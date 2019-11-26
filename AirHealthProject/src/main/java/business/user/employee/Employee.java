/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.user.employee;

import business.user.User;

/**
 *
 * @author wang.mengh
 */
public class Employee extends User {
    
    String organization;
     public Employee(){
         super("Employee");
     }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }
     
     @Override
     public String toString(){
         return this.getName()  + " ; " + this.getOrganization();
     }
}

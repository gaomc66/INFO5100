/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.TravelOffice;

import Business.TravelOffice.Customer.*;

public class TravelOffice {
    // Attributes of TravelOffice
    private String name;
    private String id;
    private static int count = 1;
    // Includes customerDirectory
    private CustomerDirectory customerDirectory;
    
    // Have the function of generate pending ticket
    
    
    public TravelOffice(){
        id = Integer.toString(count);
        count ++;
        
        this.customerDirectory = new CustomerDirectory();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }
   
    
}

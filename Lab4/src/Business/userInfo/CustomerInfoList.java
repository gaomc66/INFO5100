/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.userInfo;

import Business.Abstract.User;
import Business.Users.Customer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gaomc
 */
public class CustomerInfoList {
       
    private static CustomerInfoList customers;
    public List<User> customenrInfoList;
    
    private CustomerInfoList(){
        
        customenrInfoList = new ArrayList<User>();
        
        Customer cust1 = new Customer("Ggg1122@","gao_m@g.com");
        Customer cust2 = new Customer("Ggg1122@", "gao_m@c.com");
        
        customenrInfoList.add(cust1);
        customenrInfoList.add(cust2);
    }

    public static CustomerInfoList  getCarList() {
        // set ArrayList carInfoList
        customers = new CustomerInfoList();
        return customers;
    }
    
}

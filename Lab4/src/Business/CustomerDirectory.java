/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Abstract.User;
import Business.Users.Customer;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 *
 * @author AEDSpring2019
 */
public class CustomerDirectory {
    
    private List<User> customerList;
    private Customer customer;
    
    public CustomerDirectory(){
        customerList = new ArrayList<>();
    }

    public List<User> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<User> customenrList) {
        this.customerList = customenrList;
    }
    
    public void addCustomer(Customer custmor){
        customerList.add(custmor);
    }
    
    public User getCustomer(String name){
        return customerList.stream()
                .filter(cus -> cus.getUserName().equals("name"))
                .findFirst().get();
    }
    
    public void removeCustomer(Customer customer){
        customerList.remove(customer);
    }
    
}

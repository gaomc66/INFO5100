/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Abstract.User;
import Business.Users.Customer;
import Business.Users.Supplier;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author AEDSpring2019
 */
public class SupplierDirectory {
    
    private List<User> supplierList;
    private Supplier supplier;
    
    public SupplierDirectory(){
        supplierList = new ArrayList<>();
    }

    public List<User> getSupplierList() {
        return supplierList;
    }

    public void setSupplierList(List<User> supplierList) {
        this.supplierList = supplierList;
    }

    public void addSupplier(Supplier supplier){
        supplierList.add(supplier);
    }
    
    public Optional<User> getSupplier(String name){
        return supplierList.stream()
                .filter(supp -> supp.getUserName().equals("name"))
                .findFirst();
    }
    
    public void removeSupplier(Supplier supplier){
        supplierList.remove(supplier);
    }
    
    
}

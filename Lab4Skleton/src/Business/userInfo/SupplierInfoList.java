/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.userInfo;

import Business.Abstract.User;
import Business.Users.Supplier;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gaomc
 */
public class SupplierInfoList {
    private static SupplierInfoList suppliers;
    public List<User> supplierList;
    
    private SupplierInfoList(){
        
        supplierList = new ArrayList<User>();
        
        Supplier supp1 = new Supplier("123","supp1");
        Supplier supp2 = new Supplier("123", "supp2");
        
        supplierList.add(supp1);
        supplierList.add(supp2);
    
    }
    
    public static SupplierInfoList getSupplierList(){
        suppliers = new SupplierInfoList();
        return suppliers;
    }
    
}

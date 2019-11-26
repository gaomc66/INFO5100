/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.happylamb.airhealthplatform;

import java.io.IOException;
import com.google.gson.Gson; 


/**
 *
 * @author gaomc
 */
public class ObjToJSon {
        
       
    public static void main(String[] a) 
    { 
  
        /**Creating object of Org **/
        Org org = new Org(); 
  
        /** Insert the data into the object **/
        org = getObjectData(org); 
  
        System.out.println("Json represenatation"
                           + " of Object organisation is "); 
        // In the below line 
        // we have created a New Gson Object 
        // and call it's toJson inbuid function 
        // and passes the object of organisation 
        System.out.println(new Gson().toJson(org)); 
    } 
  
    /** Get the data to be inserted into the object **/
    public static Org getObjectData(Org org) 
    { 
        /**insert the data**/
        org.setOrg_name("GeeksforGeeks"); 
        org.setDescription("A computer Science portal for Geeks"); 
        org.setEmplyees(2000); 
  
        /**Return Object**/
        return org; 
    } 
    
}



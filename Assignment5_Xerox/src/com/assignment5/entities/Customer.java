/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kasai
 */
public class Customer {
    int id;
    List<Item> items;
    public Customer(int id){  
        this.id = id;
        items = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public List<Item> getItems() {
        return items;
    }
    
    public void addItem(Item item){
        items.add(item);
    }
    
    @Override
    public String toString(){
        return id+"";
    }
    
    

}

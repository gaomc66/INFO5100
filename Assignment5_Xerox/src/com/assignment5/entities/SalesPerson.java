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
public class SalesPerson {
    private int salesID;
    private int profit;
    private List<Item> itemList;
    
    public SalesPerson(int salseID){
        this.salesID = salseID;
        itemList = new ArrayList<>();
    }

    public int getSalesID() {
        return salesID;
    }

    public void setSalesID(int salesID) {
        this.salesID = salesID;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }
    
    
    
    @Override 
    public String toString(){
        System.out.println("ID: " + this.salesID + " --- " + itemList);

        return Integer.toString(salesID);
    }
}

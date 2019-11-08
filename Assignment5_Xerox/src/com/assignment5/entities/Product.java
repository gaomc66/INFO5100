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
public class Product {
    int id;
    int minPrice;
    int maxPrice;
    int targetPrice;
    double newTargetPrice;
    double averageSalePrice;
//    List<Item> itemlist;

    
    public Product(int id, int maxPrice, int minPrice, int targetPrice){
        this.id = id;
        this.maxPrice = maxPrice;
        this.minPrice = minPrice;
        this.targetPrice = targetPrice;
//        itemlist = new ArrayList<>();
    }
    
    public double caculateAverageSalePrice(List<Item> itemlist){
        if(!itemlist.isEmpty()){
            int total = 0;
            int totalquantity = 0;
            for(Item item : itemlist){
                total += item.salesPrice * item.quantity;
                totalquantity += item.quantity;
            }
            this.averageSalePrice = (double)total/totalquantity;
            return averageSalePrice;
        }
        return -1;
    }
    
    public double getAverageSalePrice(){
        return this.averageSalePrice;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(int minPrice) {
        this.minPrice = minPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(int maxPrice) {
        this.maxPrice = maxPrice;
    }

    public int getTargetPrice() {
        return targetPrice;
    }

    public void setTargetPrice(int targetPrice) {
        this.targetPrice = targetPrice;
    }

    public double getNewTargetPrice() {
        return newTargetPrice;
    }

    public void setNewTargetPrice(double newTargetPrice) {
        this.newTargetPrice = newTargetPrice;
    }
   
    @Override
    public String toString(){
        return Integer.toString(id);
    }
    
    
}

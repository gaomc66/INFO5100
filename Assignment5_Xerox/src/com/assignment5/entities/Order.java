/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.entities;

/**
 *
 * @author kasai
 */
public class Order {
    
    int orderId;
//    int supplierId;
    int customerId;
    Item item;
    String market_Segment;
    
    public Order(int orderId, int supplierId, int customerId, Item item, String market_Seg) {
        this.orderId = orderId;
//        this.supplierId = supplierId;
        this.customerId = customerId;
        this.item = item;
        this.market_Segment = market_Seg;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

//    public int getSupplierId() {
//        return supplierId;
//    }
//
//    public void setSupplierId(int supplierId) {
//        this.supplierId = supplierId;
//    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getMarket_Segment() {
        return market_Segment;
    }

    public void setMarket_Segment(String market_Segment) {
        this.market_Segment = market_Segment;
    }
    
    
    
}

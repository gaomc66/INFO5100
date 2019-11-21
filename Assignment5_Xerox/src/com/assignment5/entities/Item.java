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
public class Item {
    
    int productId;
    int salesPrice;
    int quantity;
    int itemID;

    public Item( int itemID, int productId, int salesPrice, int quantity) {
        this.productId = productId;
        this.salesPrice = salesPrice;
        this.quantity = quantity;
        this.itemID = itemID;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(int salesPrice) {
        this.salesPrice = salesPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }
    
    @Override
    public String toString(){
        return Integer.toString(itemID);
    }
    
    
}

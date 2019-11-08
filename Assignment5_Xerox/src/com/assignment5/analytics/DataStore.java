/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.analytics;

import com.assignment5.entities.Customer;
import com.assignment5.entities.Item;
import com.assignment5.entities.Order;
import com.assignment5.entities.Product;
import com.assignment5.entities.SalesPerson;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author gaomc
 */
public class DataStore {
    private static DataStore dataStore;
    
    private Map<Integer, Customer> customers;
    private Map<Integer, Item> items;
    private Map<Integer, Order> orders;
    private Map<Integer, Product> products;
    private Map<Integer, SalesPerson> salesPeople;

    public DataStore(){
        this.customers = new HashMap<>();
        this.items = new HashMap<>();
        this.orders = new HashMap<>();
        this.products = new HashMap<>();
        this.salesPeople = new HashMap<>();
    }
    
    public static DataStore getInstance(){
        if(dataStore == null)
            dataStore = new DataStore();
        return dataStore;
    }

    public static void setDataStore(DataStore dateStore) {
        DataStore.dataStore = dataStore;
    }
    
    public static DataStore getDataStore() {
        return dataStore;
    }

    public Map<Integer, Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Map<Integer, Customer> customers) {
        this.customers = customers;
    }
   
    public Map<Integer, Item> getItems() {
        return items;
    }

    public void setItems(Map<Integer, Item> items) {
        this.items = items;
    }

    public Map<Integer, Order> getOrders() {
        return orders;
    }

    public void setOrders(Map<Integer, Order> orders) {
        this.orders = orders;
    }

    public Map<Integer, Product> getProducts() {
        return products;
    }

    public void setProducts(Map<Integer, Product> products) {
        this.products = products;
    }

    public Map<Integer, SalesPerson> getSalesPeople() {
        return salesPeople;
    }

    public void setSalespeople(Map<Integer, SalesPerson> salesPeople) {
        this.salesPeople = salesPeople;
    }
    
    /**
     * Get a customer in the Map customers by provided customer ID.
     * 
     * If there is no matched customer ID, then create a customer using customer ID, then return the customer.
     * @param customerID
     * @return 
     */
    public Customer getCustomerByID(int customerID){
        Customer customer = customers.get(customerID);
        if( customer ==null){
            customer = new Customer(customerID);
            customers.put(customerID, customer);
        }
        
        return customer;
    }
    
}

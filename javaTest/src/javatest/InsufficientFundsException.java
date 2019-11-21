/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;

/**
 *
 * @author gaomc
 */
public class InsufficientFundsException extends Exception{
    private double needs;
    
    public InsufficientFundsException(double amount){
        this.needs = amount;
    }
    
    public double getNeeds(){
        return this.needs;
    }
}

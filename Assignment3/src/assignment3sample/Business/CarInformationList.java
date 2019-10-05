/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3sample.Business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tusiyu
 */
public class CarInformationList {
    
    private static CarInformationList carLists;
    public ArrayList<Car> carInfoList;
    
    private CarInformationList(){
        
        carInfoList = new ArrayList<Car>();
        
        Car car1 = new Car(false, "Ferrari", 2019, 1, 2, 1,"Red One", "Boston", false, null);
        Car car2 = new Car(true, "BMW", 2019, 1, 3, 2, "X1", "New York", false, null);
        Car car3 = new Car(true, "Toyota", 2018, 1, 4, 3, "T1", "Boston", true, null);
        Car car4 = new Car(false, "GM", 2018, 1, 7, 4, "G1", "New York", false, null);
        Car car5 = new Car(true, "Toyota", 2017, 1, 4, 5, "T2", "Chicago", true, null);
        Car car6 = new Car(false, "GM", 2017, 1, 6, 6, "G2", "Chicago", false, null);
        Car car7 = new Car(false, "Ferrari", 2016, 1, 4, 7, "null", "Seattle", true, null);
        Car car8 = new Car(true, "BMW", 2016, 1, 8, 8, "X2", "Seattle", true, null);
        Car car9 = new Car(false, "Toyota", 2019, 1, 4, 9, "T3", "Austin", false, null);
        Car car10 = new Car(true, "GM", 2019, 1, 5, 10, "G3", "Austin", true, null);
        
        carInfoList.add(car1);
        carInfoList.add(car2);
        carInfoList.add(car3);
        carInfoList.add(car4);
        carInfoList.add(car5);
        carInfoList.add(car6);
        carInfoList.add(car7);
        carInfoList.add(car8);
        carInfoList.add(car9);
        carInfoList.add(car10);
        
    }

    public static CarInformationList  getCarList() {
        // set ArrayList carInfoList
        carLists = new CarInformationList();
        return carLists;
    }
    
    

    
}

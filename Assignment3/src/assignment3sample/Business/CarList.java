/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3sample.Business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author gaomc
 */
public class CarList  {
    
    private ArrayList<Car> carList;
    private Date updateTime;

    public CarList(ArrayList<Car> carList){
        this.carList = new ArrayList<>(carList);
    }

    public void CarList(){
        this.carList = new ArrayList<> ();
    }
    
    public ArrayList<Car> getCarList(){
        return carList;
    }
    
    public void setCarList(ArrayList<Car> carList){
        this.carList = carList;
    }
    
    public Car addCar(){
        Car car = new Car();
        this.carList.add(car);
        return car;
    }
    
    public void deleteCar(Car car){
        this.carList.remove(car);
    }
    
    public List<String> getSetList(String type){
        List<String> tempList = new ArrayList<>();
        List<String> manufactureList = new ArrayList<>();
        
        if(null != type)switch(type){
           
            case "Manufacture":
                //tempList.clear();
                this.carList.forEach((car) -> {
                tempList.add(car.getBrand());
                });
                break;
            
            case "City":
                //tempList.clear();
                this.carList.forEach(car ->{
                    tempList.add(car.getAvailble_city());
                });
                break;
            
            case "serialNum":
                //tempList.clear();
                this.carList.forEach(car ->{
                    tempList.add(String.valueOf(car.getSerial_num()));
                });
                break;
            case "ManufactureYear":
                //tempList.clear();
                this.carList.forEach(car ->{
                    tempList.add(String.valueOf(car.getManufactured_year()));
                });
                break;
                
            case "ModelNum":
                //tempList.clear();
                this.carList.forEach(car ->{
                    tempList.add(String.valueOf(car.getModel_num()));
                }); 
                break;           
            default:
            break;
        }
        
        Set<String> tempSet = tempList.stream()
                .collect(Collectors.toSet());
        
        tempSet.forEach(a -> {
            manufactureList.add(a);
        });
        
        return manufactureList;
    }
    
    
    public List<Car> getCarList(String type, String info){
        
        if(null != type)switch (type) {
            case "searchManufacture":
                return searchManufacture(info);
            case "availbleCity":
                return availbleCity(info);
            case "brand":
                return brand(info);
            case "serialNum":
                return serialNum(info);
            case "modelNum":
                return modelNum(info);
            case "manufactureYear":
                return manufactureYear(info);
            case "maintenanceCertificate":
                boolean valid = false;
                if("true".equals(info)) valid = true;
                else if("false".equals(info)) valid = false;
                return maintenanceCertificate(valid);
            case "avaliability":
                boolean avaliable = false;
                if(info.equals("true")) avaliable = true;
                else if(info.equals("false")) avaliable = false;
                return avaliability(avaliable);
            
            default:
                break;
        }
        
        return null;
        
    }
//    public List<Car> searchCar(String type, int minSeats, int maxSeats){
//        return goodSeatsNum(minSeats,maxSeats);
//    }
    
    public List<Car> goodSeatsNum (int minSeats, int maxSeats){
        return this.carList.stream()
                .filter(car -> car.getMin_seats()<= minSeats && car.getMax_seats()>= maxSeats)
                .collect(Collectors.toList());
    }
    public List<Car> searchManufacture(String manufacture) {
        return this.carList
                .stream()
                .filter(car -> String.valueOf(car.getBrand()).equalsIgnoreCase(manufacture))
                .collect(Collectors.toList());
    }
    
    public List<Car> availbleCity(String city){
        return this.carList.stream()
                .filter(car -> car.getAvailble_city().equalsIgnoreCase(city))
                .collect(Collectors.toList());
    }
    
    public List<Car> brand(String brand){
        return this.carList.stream()
                .filter(car -> car.getBrand().equalsIgnoreCase(brand))
                .collect(Collectors.toList());
    }
    
    public List<Car> serialNum(String serialNum){
        return this.carList.stream()
                .filter(car -> String.valueOf(car.getSerial_num()).equals(serialNum))
                .collect(Collectors.toList());
    }
    
    public List<Car> modelNum(String modelNum){
        return this.carList.stream()
                .filter(car -> car.getModel_num().equalsIgnoreCase(modelNum))
                .collect(Collectors.toList());
    }
    
     private List<Car> manufactureYear(String info) {
        return this.carList.stream()
                .filter(car -> String.valueOf(car.getManufactured_year()).equals(info))
                .collect(Collectors.toList());
    }
    
    public List<Car> maintenanceCertificate(Boolean valid){
        if(valid == true){
            return this.carList.stream()
                    .filter(car -> car.isMaintenance_certificate() == true)
                    .collect(Collectors.toList());
        }else if (valid == false){
            return this.carList.stream()
                .filter(car -> car.isMaintenance_certificate() == false)
                .collect(Collectors.toList());
        }
        return null;
    }
    


    private List<Car> avaliability(Boolean avaliable) {
        if(avaliable == true){
            return this.carList.stream()
                .filter(car -> car.isAvailable() == true)
                .collect(Collectors.toList());
        }else{
            return this.carList.stream()
                .filter(car -> car.isAvailable() == false)
                .collect(Collectors.toList());
        }
    }
    
    public void setTime(){
        Long millisTime = System.currentTimeMillis();
        updateTime = new Date(millisTime);
    }
    
    public Date getTime(){
        return updateTime;
    }
   
}

/*
 * HappyLamb - TravelAgencySystem
 * Each line should be prefixed with  * 
 */
package Business;

import Business.Airliner.Airliner;
import Business.Airliner.AirlinerDirectory;
import Business.Airliner.Flight.Flight;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * This is a singlton class, which store all the airliners for searching the flights.
 * @author sallywang
 */
public class MasterTravelSchedule {
    
    private static MasterTravelSchedule masterTS;
    private AirlinerDirectory airlinerDir;
    
    /**
     * Get a instance of Class MasterTravelSchedule. 
     * If there is no object of MasterTravelSchedule, then create one use private constructor
     * Or return the object created before. 
     * @return a MasterTravelSchedule object
     */
    public static MasterTravelSchedule getInstance(){
        if(masterTS == null){
            masterTS = new MasterTravelSchedule();
        }
        return masterTS;
    }
    private MasterTravelSchedule(){
        airlinerDir = new AirlinerDirectory();
    }
    
    public void setAirlinerDirectory(AirlinerDirectory airlinerDir){
        this.airlinerDir = airlinerDir;
    }
    
    public void addAirliner(Airliner airliner){
        airlinerDir.addAirliner(airliner);
    }
    
    public boolean removeAirliner(Airliner airliner){
        boolean success = airlinerDir.removeAirliner(airliner);
        return success;
    }
    
    /**
     * Search a flight by flight number.
     * @param flightNo
     * @return the exact flight object whose flight number is the same as the input flightNo
     */
    public Flight searchFlightsByFlightNum(String flightNo){
        Flight foundedFl = null;
        List<Flight> allFlights = getAllFlightsOfAirliners();
        for(Flight fl : allFlights){
            if(fl.getFlightNo().equals(flightNo)){
                foundedFl = fl;
                break;
            }
        }
        
        return foundedFl;
    }
    
    /**
     * Search all the flights by departure location
     * @param departLocation
     * @return a list of flight
     */
    public List<Flight> searchFlightByDeparture(String departLocation){
        List<Flight> foundedFlights = new ArrayList<Flight>();
        List<Flight> allFlights = getAllFlightsOfAirliners();
        for(Flight fl : allFlights){
            if(fl.getDeparture().equals(departLocation)){
                foundedFlights.add(fl);
            }
        }    
        return foundedFlights;
    }
    
    /**
     * Search all the flights by arrive location
     * @param arriveLocation
     * @return a list of flight  
     */
    public List<Flight> searchFlightByArrival(String arriveLocation){
        List<Flight> foundedFlights = new ArrayList<Flight>();
        List<Flight> allFlights = getAllFlightsOfAirliners();
        for(Flight fl : allFlights){
            if(fl.getDestination().equals(arriveLocation)){
                foundedFlights.add(fl);
            }
        }    
        return foundedFlights;
    }
    
    /**
     * Search all the flights by time range(morning,evening or daytime)
     * morning: 05:00 - 9:59
     * daytime: 10:00 - 19:59
     * evening: 20:00 - 04:59
     * @param timeRange("morning","evening" or "daytime")
     * @return a list of flight  
     */
    public List<Flight> searchFlightByTimeRange(String timeRange){
        List<Flight> foundedFlights = new ArrayList<Flight>();
        List<Flight> allFlights = getAllFlightsOfAirliners();
        for(Flight fl : allFlights){
            if(fl.getStartTimeRange().equals(timeRange)){
                foundedFlights.add(fl);
            }
        }    
        return foundedFlights;
    }
    
    /**
     * Search all the flights by date
     * @param date
     * @return a list of flights
     */
    public List<Flight> searchFlightByTimeRange(LocalDate date){
        List<Flight> foundedFlights = new ArrayList<Flight>();
        List<Flight> allFlights = getAllFlightsOfAirliners();
        for(Flight fl : allFlights){
            if(fl.getDate().equals(date)){
                foundedFlights.add(fl);
            }
        }    
        return foundedFlights;
    }
    
    /**
     * Get all the flights from each airliner
     * @return all the flights
     */
    public List<Flight> getAllFlightsOfAirliners(){
        List<Flight> allFlights = new ArrayList<Flight>();
        System.out.println("666" );

        for(Airliner al : airlinerDir.getAirlinerList()){
            System.out.println("al" );
            for(Flight fl : al.getFlightSchedual().getFlghtList())
                allFlights.add(fl);
        }
        
        
        
        return allFlights;
    }
    
    
    
}

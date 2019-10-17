/*
 * HappyLamb - TravelAgencySystem
 * Each line should be prefixed with  * 
 */
package Business;

import Business.Airliner.Airliner;
import Business.Airliner.AirlinerDirectory;
import Business.Flight.FlightSchedual;
import Business.TravelOffice.Customer.Customer;
import Business.TravelOffice.TravelOffice;
import Business.UserAccount.UserAccount;

/**
 *
 * @author gaomc
 */
public class Configuration {
    
    public static Business configure(){
        
        Business business = Business.getInstance();
        
        TravelAgency travelAgency = new TravelAgency();        
        business.getTravelAgencyDirectory().getTavelAgencyList().add(travelAgency);
                
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername("Admin");
        userAccount.setPassword("admin");
        userAccount.setRole("TravelAgency");
        
        travelAgency.getUserAccountDirectory().getUserAccountList().add(userAccount);
        
//        AirlinerDirectory airlinerDirectory = new AirlinerDirectory();
        configureAirliner(travelAgency);
        configureTravelOffice(travelAgency);
        
        return business;
    }
    
    public static void configureAirliner(TravelAgency travelAgency){
        
        Airliner airliner = new Airliner();
        airliner.setId("001");
        airliner.setName("BlueJet");
        travelAgency.getAirlinerDirectory().getAirlinerList().add(airliner);
 
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername("BlueJet");
        userAccount.setPassword("111");
        userAccount.setRole("Airliner");
        userAccount.setMember(airliner);
        
        travelAgency.getUserAccountDirectory().getUserAccountList().add(userAccount);
    
        FlightSchedual flightSchedual = new FlightSchedual();
        
    }

    private static void configureTravelOffice(TravelAgency travelAgency) {
        TravelOffice travelOffice = new TravelOffice();
        travelOffice.setName("BOS_LOGAN");
        travelAgency.getTravelOfficeDirectory().getTravelOfficList().add(travelOffice);
        
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername("BOS_LOGAN");
        userAccount.setPassword("111");
        userAccount.setRole("TravelOffice");
        userAccount.setMember(travelOffice);
        
        travelAgency.getUserAccountDirectory().getUserAccountList().add(userAccount);
        
        configureCustomer(travelOffice);
    
    }
    
    public static void configureCustomer(TravelOffice travelOffice){
        Customer customer1 = new Customer(travelOffice);
        customer1.setName("Wei");
        customer1.setIdentityInfo("Passport:123");
        
        
        Customer customer2 = new Customer(travelOffice);
        customer2.setName("Zhang");
        customer2.setIdentityInfo("DriverLicense:333");
        
        travelOffice.getCustomerDirectory().getCustomerList().add(customer1);
        travelOffice.getCustomerDirectory().getCustomerList().add(customer2);

    }
  
}

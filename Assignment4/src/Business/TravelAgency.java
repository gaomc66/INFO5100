/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Airliner.AirlinerDirectory;
import Business.TravelOffice.TravelOfficeDirectory;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;

public class TravelAgency {
    // Usr Account
    UserAccount userAcccount;
    UserAccountDirectory userAccountDirectory;
    // multi-Airliner
    AirlinerDirectory airlinerDirectory;
    // multi-Retailer
    TravelOfficeDirectory travelOfficeDirectory;
    
    public TravelAgency(){
        this.userAccountDirectory = new UserAccountDirectory();
        this.airlinerDirectory = new AirlinerDirectory();
        this.travelOfficeDirectory = new TravelOfficeDirectory();
    }
    
}

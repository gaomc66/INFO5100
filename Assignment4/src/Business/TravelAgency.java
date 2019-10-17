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
//    private UserAccount userAcccount;
    private UserAccountDirectory userAccountDirectory;
    // multi-Airliner
    private AirlinerDirectory airlinerDirectory;
    // multi-Retailer
    private TravelOfficeDirectory travelOfficeDirectory;
    
    public TravelAgency(){
        this.userAccountDirectory = new UserAccountDirectory();
        this.airlinerDirectory = new AirlinerDirectory();
        this.travelOfficeDirectory = new TravelOfficeDirectory();
    }

    public AirlinerDirectory getAirlinerDirectory() {
        return airlinerDirectory;
    }

    public TravelOfficeDirectory getTravelOfficeDirectory() {
        return travelOfficeDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

}

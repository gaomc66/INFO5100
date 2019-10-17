/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airliner.Fleet;

import Business.UserAccount.UserAccount;


public class Airplane {
    // how many seats for a single Ariplane
    private int seatNumber;
    // Airplane Serial Number
    private String serialNumber;
    private String modelNumber;
   

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
}

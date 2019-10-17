/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airliner;

import java.util.ArrayList;

/**
 *
 * @author gaomc
 */
public class AirlinerDirectory {
    
    private ArrayList<Airliner> airlinerList;
    
    public AirlinerDirectory(){
        airlinerList = new ArrayList<>();
    }
    
    public ArrayList<Airliner> getAirlinerList(){
        return airlinerList;
    }
    
    public Airliner createAirliner(){
        Airliner airliner = new Airliner();
        return airliner;
    }
}

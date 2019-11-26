/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.enterprise.Enterprise.EnterpriseType;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author xinlu
 */
public class VolunteerEnterprise extends Enterprise{
    public VolunteerEnterprise(String name){
        super(name,EnterpriseType.Volunteer);
    }
    public ArrayList<Role> getSupportedRole(){
        return null;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role.volunteer;

import business.AirDoctorVolunteerPlatform;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.organization.volunteer.FinanceOrganization;
import business.role.Role;
import business.useraccount.UserAccount;
import javax.swing.JPanel;
import userInterface.volunteer.finance.FinanceWorkAreaJPanel;

/**
 *
 * @author xinlu
 */
public class FinanceRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, AirDoctorVolunteerPlatform business) {
        return new FinanceWorkAreaJPanel(userProcessContainer, account, (FinanceOrganization)organization, enterprise);
    }
    
    @Override
    public String toString(){
        return "Finance";
    }
}

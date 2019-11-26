/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role.government;

import business.AirDoctorVolunteerPlatform;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.organization.government.GovernmentAdminOrganization;
import business.role.Role;
import business.useraccount.UserAccount;
import javax.swing.JPanel;
import userInterface.government.GovAdminWorkAreaJPanel;

/**
 *
 * @author xinlu
 */
public class GovernmentAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, AirDoctorVolunteerPlatform business) {
        return new GovAdminWorkAreaJPanel(userProcessContainer, account, (GovernmentAdminOrganization)organization, enterprise);
    }
    
}

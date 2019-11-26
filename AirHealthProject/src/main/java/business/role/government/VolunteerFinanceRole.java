/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role.government;

import business.AirDoctorVolunteerPlatform;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.organization.government.VolunteerFinanceOrganization;
import business.role.Role;
import business.useraccount.UserAccount;
import javax.swing.JPanel;
import userInterface.government.VolunteerFinance.VolunteerFinanceWorkAreaJPanel;

/**
 *
 * @author xinlu
 */
public class VolunteerFinanceRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, AirDoctorVolunteerPlatform business) {
        return new VolunteerFinanceWorkAreaJPanel(userProcessContainer, account, (VolunteerFinanceOrganization)organization, enterprise);
    }
}

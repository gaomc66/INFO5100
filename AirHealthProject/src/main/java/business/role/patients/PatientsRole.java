/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role.patients;

import business.AirDoctorVolunteerPlatform;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.organization.patients.PatientsOrganization;
import business.role.Role;
import business.useraccount.UserAccount;
import javax.swing.JPanel;
import userInterface.patients.PatientsWorkAreaJPanel;

/**
 *
 * @author gaomc
 */
public class PatientsRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, AirDoctorVolunteerPlatform system) {
        return new PatientsWorkAreaJPanel(userProcessContainer, account, (PatientsOrganization)organization, enterprise);
    }
    
    @Override
    public String toString(){
        return "Patient";
    }
}

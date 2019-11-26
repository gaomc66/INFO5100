/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role.hospital;

import business.AirDoctorVolunteerPlatform;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.organization.hospital.ClinicOrganization;
import business.role.Role;
import business.useraccount.UserAccount;
import javax.swing.JPanel;
import userInterface.hospital.clinic.ClinicWorkAreaJPanel;

/**
 *
 * @author xinlu
 */
public class ClinicRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, AirDoctorVolunteerPlatform business) {
        return new ClinicWorkAreaJPanel(userProcessContainer, account, (ClinicOrganization)organization, enterprise);
    }
}

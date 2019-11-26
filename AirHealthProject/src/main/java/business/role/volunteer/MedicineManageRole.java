/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role.volunteer;

import business.AirDoctorVolunteerPlatform;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.organization.volunteer.MedicineManageOrganization;
import business.role.Role;
import business.useraccount.UserAccount;
import javax.swing.JPanel;
import userInterface.volunteer.medicineManage.MedicineManageWorkAreaJPanel;

/**
 *
 * @author xinlu
 */
public class MedicineManageRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, AirDoctorVolunteerPlatform business) {
        return new MedicineManageWorkAreaJPanel(userProcessContainer, account, (MedicineManageOrganization)organization, enterprise);
    }
    
    @Override
    public String toString(){
        return "MedicineManage";
    }
}

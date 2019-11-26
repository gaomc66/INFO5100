/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.AirDoctorVolunteerPlatform;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.useraccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author xinlu
 */
public abstract class Role {
        public enum RoleType{
        Patient("Patient"),
        GovernmentAdmin("GovernmentAdmin"),
        VolunteerFinance("VolunteerFiance"),
        Clinic("Clinic"),
        HospitalAdmin("HospitalAdmin"),
        Reciption("Reciption"),
        Charity("Charity"),
        PharmacyAdmin("PharmacyAdmin"),
        Finance("Finance"),
        HospitalContact("HospitalContact"),
        MedicineManage("MedicineManage"),
        VolunteerAdmin("VolunteerAdmin"),
        VolunteerDoctor("VolunteerDoctor");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
        
    }
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
        UserAccount account, 
        Organization organization, 
        Enterprise enterprise, 
        AirDoctorVolunteerPlatform system);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}

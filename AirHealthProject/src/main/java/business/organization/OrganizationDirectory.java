/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.organization.Organization.Type;
import business.organization.government.GovernmentAdminOrganization;
import business.organization.government.VolunteerFinanceOrganization;
import business.organization.hospital.ClinicOrganization;
import business.organization.hospital.HospitalAdminOrganization;
import business.organization.hospital.ReciptionOrganization;
import business.organization.pharmacy.CharityOrganization;
import business.organization.pharmacy.PharmacyAdminOrganization;
import business.organization.volunteer.FinanceOrganization;
import business.organization.volunteer.HospitalContactOrganization;
import business.organization.volunteer.MedicineManageOrganization;
import business.organization.volunteer.VolunteerAdminOrganization;
import business.organization.volunteer.VolunteerDoctorOrganization;
import java.util.ArrayList;

/**
 *
 * @author xinlu
 */
public class OrganizationDirectory {
        private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Charity.getValue())){
            organization = new CharityOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Clinic.getValue())){
            organization = new ClinicOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Finance.getValue())){
            organization = new FinanceOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.GovernmentAdmin.getValue())){
            organization = new GovernmentAdminOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.HospitalAdmin.getValue())){
            organization = new HospitalAdminOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.HospitalContact.getValue())){
            organization = new HospitalContactOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.MedicineManage.getValue())){
            organization = new MedicineManageOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.PharmacyAdmin.getValue())){
            organization = new PharmacyAdminOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Reciption.getValue())){
            organization = new ReciptionOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.VolunteerAdmin.getValue())){
            organization = new VolunteerAdminOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.VolunteerDoctor.getValue())){
            organization = new VolunteerDoctorOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.VolunteerFinance.getValue())){
            organization = new VolunteerFinanceOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization.patients;

import business.organization.Organization;
import business.role.Role;
import business.role.patients.PatientsRole;
import java.util.ArrayList;

/**
 *
 * @author gaomc
 */
public class PatientsOrganization extends Organization{

    public PatientsOrganization(String name) {
        super(Organization.Type.Patients.getValue());
    }

    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PatientsRole());
        return roles;
    }
    
}


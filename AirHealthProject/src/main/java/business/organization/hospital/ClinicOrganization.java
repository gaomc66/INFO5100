/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization.hospital;

import business.organization.Organization;
import business.role.Role;
import business.role.hospital.ClinicRole;
import java.util.ArrayList;

/**
 *
 * @author xinlu
 */
public class ClinicOrganization extends Organization{
    public ClinicOrganization() {
        super(Organization.Type.Clinic.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ClinicRole());
        return roles;
    }
}

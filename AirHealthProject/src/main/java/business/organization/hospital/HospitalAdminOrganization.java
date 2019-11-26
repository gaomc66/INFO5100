/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization.hospital;

import business.organization.Organization;
import business.role.Role;
import business.role.hospital.HospitalAdminRole;
import java.util.ArrayList;

/**
 *
 * @author xinlu
 */
public class HospitalAdminOrganization extends Organization{
    public HospitalAdminOrganization() {
    super(Organization.Type.HospitalAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HospitalAdminRole());
        return roles;
    }
}

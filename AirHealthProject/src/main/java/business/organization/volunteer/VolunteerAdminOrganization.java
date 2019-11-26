/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization.volunteer;

import business.organization.Organization;
import business.role.Role;
import business.role.volunteer.VolunteerAdminRole;
import java.util.ArrayList;

/**
 *
 * @author xinlu
 */
public class VolunteerAdminOrganization extends Organization{
        public VolunteerAdminOrganization() {
        super(Organization.Type.VolunteerAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new VolunteerAdminRole());
        return roles;
    }
}

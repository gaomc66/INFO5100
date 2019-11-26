/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization.volunteer;

import business.organization.Organization;
import business.role.Role;
import business.role.volunteer.VolunteerDoctorRole;
import java.util.ArrayList;

/**
 *
 * @author xinlu
 */
public class VolunteerDoctorOrganization extends Organization{
        public VolunteerDoctorOrganization() {
        super(Organization.Type.VolunteerDoctor.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new VolunteerDoctorRole());
        return roles;
    }
}

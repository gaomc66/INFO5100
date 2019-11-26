/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization.volunteer;

import business.organization.Organization;
import business.role.Role;
import business.role.volunteer.HospitalContactRole;
import java.util.ArrayList;

/**
 *
 * @author xinlu
 */
public class HospitalContactOrganization extends Organization{
        public HospitalContactOrganization() {
        super(Organization.Type.HospitalContact.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HospitalContactRole());
        return roles;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization.government;

import business.organization.Organization;
import business.role.Role;
import business.role.government.VolunteerFinanceRole;
import java.util.ArrayList;

/**
 *
 * @author xinlu
 */
public class VolunteerFinanceOrganization extends Organization{
        public VolunteerFinanceOrganization() {
        super(Organization.Type.VolunteerFinance.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new VolunteerFinanceRole());
        return roles;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization.pharmacy;

import business.organization.Organization;
import business.role.Role;
import business.role.pharmacy.PharmacyAdminRole;
import java.util.ArrayList;

/**
 *
 * @author xinlu
 */
public class PharmacyAdminOrganization extends Organization{
    public PharmacyAdminOrganization() {
    super(Organization.Type.PharmacyAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PharmacyAdminRole());
        return roles;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Organization.AdminOrganization;
import Business.Organization.DoctorOrganization;
import Business.Organization.LabOrganization;
import Business.UserAccount.UserAccount;

/**
 *
 * @author ran
 */
public class ConfigureABusiness {
    
    public static Business configure(){
        // Three roles: LabAssistant, Doctor, Admin
        
        Business business = Business.getInstance();
        
        // Create Admin Organization
        AdminOrganization adminOrganization = new AdminOrganization();
        
        // add created admin organization into Business
        business.getOrganizationDirectory().getOrganizationList().add(adminOrganization);
        
        // Create a new emplyee
        Employee employeeAdmin = new Employee();
        employeeAdmin.setName("Mike");
       
        // Create a new account
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername("admin");
        userAccount.setPassword("admin");
        userAccount.setRole("Admin");
        
        // assign the account to employee
        userAccount.setEmployee(employeeAdmin);
        
        // add the employee into admin org
        adminOrganization.getEmployeeDirectory().getEmployeeList().add(employeeAdmin);
        // add the account into admin org
        adminOrganization.getUserAccountDirectory().getUserAccountList().add(userAccount);
        
        
        DoctorOrganization doctorOrganization = new DoctorOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(doctorOrganization);
        Employee employeeDoc = new Employee();
        employeeDoc.setName("Alice");
        UserAccount docAccount = new UserAccount();
        docAccount.setUsername("doctor");
        docAccount.setPassword("doctor");
        docAccount.setRole("Doctor");
        docAccount.setEmployee(employeeDoc);
        doctorOrganization.getEmployeeDirectory().getEmployeeList().add(employeeDoc);
        doctorOrganization.getUserAccountDirectory().getUserAccountList().add(docAccount);
        
        LabOrganization labOrganization = new LabOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(labOrganization);
        Employee employeeLab = new Employee();
        employeeLab.setName("Bob");
        UserAccount labAccount = new UserAccount();
        labAccount.setUsername("lab");
        labAccount.setPassword("lab");
        labAccount.setRole("Doctor");
        labAccount.setEmployee(employeeLab);
        labOrganization.getEmployeeDirectory().getEmployeeList().add(employeeLab);
        labOrganization.getUserAccountDirectory().getUserAccountList().add(labAccount);
        
        return business;
    }
    
}

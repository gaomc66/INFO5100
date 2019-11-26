/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.user.employee.Employee;
import business.role.SystemAdminRole;
import business.role.patients.PatientsRole;
import business.role.volunteer.VolunteerDoctorRole;
import business.user.User;
import business.user.UserDirectory;
import business.useraccount.UserAccount;
import business.useraccount.UserAccountDirectory;

/**
 *
 * @author xinlu
 */
public class ConfigureSystem {
    
        public static AirDoctorVolunteerPlatform configure(){
        
        AirDoctorVolunteerPlatform system = AirDoctorVolunteerPlatform.getInstance();
        UserAccountDirectory userAccountDirectory = system.getUserAccountDirectory();
        UserDirectory userDirectory = system.getUserDirectory();
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        
        
        User user = userDirectory.createUser("sysadmin", "Super_Admin");
        
        UserAccount ua = userAccountDirectory.createUserAccount("sysadmin", "sysadmin", user, new SystemAdminRole());
        
        
        User patient1 = userDirectory.createUser("json_patient", "Patient");
        UserAccount userAccount_patient1 = userAccountDirectory.createUserAccount("json", "json", patient1, new PatientsRole());
            System.out.println(userAccount_patient1.getRole().toString());
            System.out.println("&&&&&&&&");
        User doctor1 = userDirectory.createUser("mike_doctor", "doctor");
        UserAccount userAccount_doctor1 = userAccountDirectory.createUserAccount("mike", "mike", doctor1, new VolunteerDoctorRole());
        
        
        
        return system;
    }
}

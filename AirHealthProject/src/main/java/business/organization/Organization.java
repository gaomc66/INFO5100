/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.user.UserDirectory;
import business.role.Role;
import business.useraccount.UserAccountDirectory;
import business.workqueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author xinlu
 */
public abstract class Organization {
    private String name;
    private WorkQueue workQueue;
    private UserDirectory userDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
        Patients("Patients Organization"),
        GovernmentAdmin("GovernmentAdmin Organization"),
        VolunteerFinance("VolunteerFiance Organization"),
        Clinic("Clinic Organization"),
        HospitalAdmin("HospitalAdmin Organization"),
        Reciption("Reciption Organization"),
        Charity("Charity Organization"),
        PharmacyAdmin("PharmacyAdmin Organization"),
        Finance("Finance Organization"),
        HospitalContact("HospitalContact Organization"),
        MedicineManage("MedicineManage Organization"),
        VolunteerAdmin("VolunteerAdmin Organization"),
        VolunteerDoctor("VolunteerDoctor Organization");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        userDirectory = new UserDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public UserDirectory getUserDirectory() {
        return userDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
}

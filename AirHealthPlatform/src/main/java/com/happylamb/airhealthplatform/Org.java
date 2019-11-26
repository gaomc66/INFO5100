/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.happylamb.airhealthplatform;

/**
 *
 * @author gaomc
 */
public class Org {
    private String org_name;
    private String description;
    private int Emplyees;

    public String getOrg_name() {
        return org_name;
    }

    public void setOrg_name(String org_name) {
        this.org_name = org_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getEmplyees() {
        return Emplyees;
    }

    public void setEmplyees(int Emplyees) {
        this.Emplyees = Emplyees;
    }

    @Override
    public String toString() {
        return "Organisation [organisation_name=]"
                + org_name
                + ", description="
                + description
                + ", Employees="
                + Emplyees + "]";
    }
    
    
}

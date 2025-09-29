/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test4prep2022;

/**
 *
 * @author lab_services_student
 */
public abstract class Staff implements IStaff {
    int staffNumber;
    String location;
    
    
    public Staff (int staffNumber, String location) {
        this.staffNumber = staffNumber;
        this.location = location;
    }
    
    @Override
    public int getStaffNumber(){
    return staffNumber;
    }
    
    @Override
    public String getStaffLocation(){
    return location;
    }
    
    @Override
    public String getStaffHiringProcess(){
        return "";
    }
}

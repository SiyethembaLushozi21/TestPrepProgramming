/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programming1btest;

/**
 *
 * @author lab_services_student
 */
public class Icricket {
    
    
    @Override
    public void PrintFine() {
        System.out.println("Citizen Name: " + getBATSMEN());
        System.out.println("Speed: " + getSpeed() + "km/h");
        System.out.printf("Fine Due: R%.2f\n", getFinePayable());
    }
}


    


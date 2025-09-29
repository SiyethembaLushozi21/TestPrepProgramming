/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programming1btest;

/**
 *
 * @author lab_services_student
 */
public class Programming1BTest {

    public static void main(String[] args) {
        
       




       
        String[] stadiums = {"Kingsmead", "ST Georges", "Wanderers"};

        
        String[] batsmen = {"Jacques Kallis", "Hashim Amla", "Ab De viliiers"};

        
        int[][] runsScored = {
            
            {5000, 3500, 6200},
           
            {3800, 3700, 5000},
            
            {4200, 3900, 5200}
        };

       
        System.out.println("=================================================");
        System.out.println("        Cricket Batting Performance Report       ");
        System.out.println("=================================================");

        System.out.println("\n--- Runs Scored at Each Stadium ---");
        System.out.printf("%-15s | %-10s | %-10s | %-10s%n", "Batsman", stadiums[0], stadiums[1], stadiums[2]);
        System.out.println("----------------|------------|------------|------------");

        for (int i = 0; i < batsmen.length; i++) {
            System.out.printf("%-15s | %-10d | %-10d | %-10d%n",
                              batsmen[i],
                              runsScored[i][0], 
                              runsScored[i][1],
                              runsScored[i][2]); 
        }

        
        System.out.println("\n--- Total Runs Scored by Each Batsman ---");
        System.out.printf("%-15s | %-10s%n", "Batsman", "Total Runs");
        System.out.println("----------------|------------");

        for (int i = 0; i < batsmen.length; i++) {
            int totalRuns = 0;
        
            for (int j = 0; j < stadiums.length; j++) {
                totalRuns += runsScored[i][j];
            }
            
            System.out.printf("%-15s | %-10d%n", batsmen[i], totalRuns);
        }

        System.out.println("=================================================");
    }
}
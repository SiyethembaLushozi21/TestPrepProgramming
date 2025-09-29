/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programming1btest;
 import java.util.Scanner;
/**
 *
 * @author lab_services_student
 */
public class Cricket {
  

    



   
    private static final String[] BATSMEN = {"Jacques", "Hashim", "AB de Villiers"};
    private static final String[] STADIUMS = {"Wanderers", "Newlands", "Centurion"};

  
    private static final int[][] RUNS_SCORED = {
        {5200, 3500, 6200},   // Jacques
        {3800, 3700, 3900},   // Hashim
        {6200, 5000, 5200}   // AB de Villiers
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================================");
        System.out.println("  Cricket Batting Performance Lookup Console  ");
        System.out.println("=================================================");

   
        while (true) {
           
            System.out.println("\nAvailable Batsmen: " + String.join(", ", BATSMEN));
            System.out.println("Available Stadiums: " + String.join(", ", STADIUMS));

          
            System.out.print("\nEnter Batsman Name (or 'exit' to quit): ");
            String batsmanInput = scanner.nextLine().trim();

            if (batsmanInput.equalsIgnoreCase("exit")) {
                System.out.println("\nExiting application. Goodbye!");
                break;
            }

    
            System.out.print("Enter Stadium Name: ");
            String stadiumInput = scanner.nextLine().trim();

            // --- Step 4: Perform Lookup and Display Result ---
            lookupScore(batsmanInput, stadiumInput);

            System.out.println("-------------------------------------------------");
        }

        scanner.close();
    }

    /**
     * Looks up and prints the runs scored by a given batsman at a given stadium.
     * @param batsmanName The name of the batsman (case-insensitive).
     * @param stadiumName The name of the stadium (case-insensitive).
     */
    public static void lookupScore(String batsmanName, String stadiumName) {
        // Find the index of the batsman
        int batsmanIndex = -1;
        for (int i = 0; i < BATSMEN.length; i++) {
            if (BATSMEN[i].equalsIgnoreCase(batsmanName)) {
                batsmanIndex = i;
                break;
            }
        }

     
        int stadiumIndex = -1;
        for (int j = 0; j < STADIUMS.length; j++) {
            if (STADIUMS[j].equalsIgnoreCase(stadiumName)) {
                stadiumIndex = j;
                break;
            }
        }

     
        if (batsmanIndex != -1 && stadiumIndex != -1) {
            int runs = RUNS_SCORED[batsmanIndex][stadiumIndex];
            System.out.printf("\nREPORT: %s scored %d runs at %s.%n", 
                              BATSMEN[batsmanIndex], runs, STADIUMS[stadiumIndex]);
        } else {
          
            System.out.println("\nERROR: Invalid input. Please check the spelling.");
            if (batsmanIndex == -1) {
                System.out.println("  - Batsman '" + batsmanName + "' not found.");
            }
            if (stadiumIndex == -1) {
                System.out.println("  - Stadium '" + stadiumName + "' not found.");
            }
        }
    }
}   
    
    
    
    


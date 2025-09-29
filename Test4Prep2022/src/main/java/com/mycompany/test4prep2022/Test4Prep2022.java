/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test4prep2022;

/**
 *
 * @author lab_services_student
 */
public class Test4Prep2022 {
    public static void main(String[] args) {
        // Months
        String[] months = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN"};

        // Data: [rows = months][columns = {Bathrooms, Kitchens, Garden}]
        int[][] makeovers = {
            {8, 2, 5}, // JAN
            {7, 4, 5}, // FEB
            {5, 5, 2}, // MAR
            {2, 2, 3}, // APR
            {7, 7, 9}, // MAY
            {7, 8, 5}  // JUN
        };

        // Print header
        System.out.println("HOME MAKEOVER REPORT");
        System.out.println("-------------------------------------------------");
        System.out.printf("%-5s %-10s %-10s %-10s%n", "", "Bathrooms", "Kitchens", "Garden");
        System.out.println("-------------------------------------------------");

        // Print monthly data
        for (int i = 0; i < months.length; i++) {
            System.out.printf("%-5s %-10d %-10d %-10d%n",
                    months[i], makeovers[i][0], makeovers[i][1], makeovers[i][2]);
        }

        System.out.println("-------------------------------------------------");
        System.out.println("MONTHLY TOTALS");
        System.out.println("-------------------------------------------------");

        // Print totals
        for (int i = 0; i < months.length; i++) {
            int total = makeovers[i][0] + makeovers[i][1] + makeovers[i][2];
            System.out.printf("%-5s %-5d", months[i], total);

            // Add stars if total >= 15
            if (total >= 15) {
                System.out.print("  ***");
            }
            System.out.println();
        }

        System.out.println("-------------------------------------------------");
    }
}



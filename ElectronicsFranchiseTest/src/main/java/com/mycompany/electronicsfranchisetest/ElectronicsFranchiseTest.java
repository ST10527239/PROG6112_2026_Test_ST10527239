/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.electronicsfranchisetest;

/**
 *
 * @author emeris
 */
public class ElectronicsFranchiseTest {

    public static void main(String[] args) {
        
        String[] cities ={
            "Cape Town",
            "Port Elizabeth",
            "Pretoria"
        };
        
        String[] consoles = {
            "PS5",
            "XBOX",
            "SWITCH"
        
  
        };
        
        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200},
        };
        
        int total = 0;
        
        System.out.println("-------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("-------------------------------------------------");
        
        System.out.println("\tPS5\tXBOX\tSWITCH");
        
        for (int i = 0; i < cities.length; i++){
            
            for (int row = 0; row < sales.length; row++) {

            
            System.out.print(consoles[row] + "\t");


            
            for (int column = 0; column < sales[row].length; column++) {

                
                System.out.print(sales[row][column] + "\t");


                
                total = total + sales[row][column];
        }
            }

        System.out.println();
        
        System.out.println("-------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY ");
        System.out.println("-------------------------------------------------");
        
        
        System.out.println("Cape Town" + total);
        System.out.println("Port Elizabeth" + total);
        System.out.println("Pretoria" + total);
    }
            
}
}

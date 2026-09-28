/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.electronicsfranchisetest;

/**
 *
 * @author emeris
 */
public class ConsoleSales extends Consoles{

    public ConsoleSales(String ConsoleType, String Store, int TotalSales) {
        super(ConsoleType, Store, TotalSales);
    }
    
    public void printReport(){
        
        System.out.println("Console Type: " + getConsoleType());
        System.out.println("Store Name: " + getStore());
        System.out.println("Total Amount of Sales: " + getTotalSales());
    }
    
}

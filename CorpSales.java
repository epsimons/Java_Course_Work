/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corpsales;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author Ethan
 */
public class CorpSales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int DIVS = 3; // Three divisions in the company
        final int QTRS =4;  // Four quarters
        double totalSales = 0.0; // Accumulator
        
        // Create an array to hold the sales for each
        // division, for each quarter
        
        double[][] sales = new double[DIVS][QTRS];
        
        // Create a Scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);
        
        // Display an introduction
        System.out.println("This program will calculate the total sales of");
        System.out.println("all the company's divisions. Enter the following data:");
        
        // Nested loops to fill the array with quarterly
        // sales figures for each division
        for(int div = 0; div < DIVS; div++)
        {
            for(int qtr = 0; qtr < QTRS; qtr++)
            {
                System.out.print("Division " + (div + 1) + ", Quarter " + (qtr + 1) + ": $");
                sales[div][qtr] = keyboard.nextDouble();
            }
            System.out.println();    // Blank line
        }
        
        // Nested loops to add all the elements of the array.
        for(int div = 0; div < DIVS; div++)
        {
            for(int qtr = 0; qtr < QTRS; qtr++)
            {
                totalSales += sales[div][qtr];
            }
        }
        
        // Creadte a decimal format object to format output
        DecimalFormat dollar = new DecimalFormat("#,##0.00");
        
        // Display the total sales
        System.out.println("The total sales for the company are $" + dollar.format(totalSales));
    }
    
}

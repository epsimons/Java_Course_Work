/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cellphone;

/**
 *
 * @author Ethan
 */

import java.util.Scanner;

public class CellPhoneTest {

    /**
     * @param args the command line arguments
     */
    

    public static void main(String[] args) {
        String testMan;
        String testMod;
        double testPrice;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter the manufacturer: ");
        testMan = keyboard.nextLine();
        
        System.out.print("Enter the model number: ");
        testMod = keyboard.nextLine();
        
        System.out.print("Enter the retail price: ");
        testPrice = keyboard.nextDouble();
        
        CellPhone phone = new CellPhone(testMan, testMod, testPrice);
        
        System.out.println();
        System.out.println("Here is the data that you provided:");
        System.out.println("Manufacturer: " + phone.getManufact());
        System.out.println("Model Number: " + phone.getModel());
        System.out.println("Retail Price: " + phone.getRetailPrice());
        
    }
    
}

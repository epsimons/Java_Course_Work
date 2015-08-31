/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passbyvalue;

/**
 *
 * @author Ethan
 */
public class PassByValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number = 99;
        System.out.println("number is "+number);
        changeMe(number);
        System.out.println("number is "+number);
        
    }
    
    public static void changeMe(int myValue)
    {
        System.out.println("I am changing the value.");
        myValue = 0;
        System.out.println("Now the value is "+ myValue);
    }
    
}

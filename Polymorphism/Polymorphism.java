/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

    import java.io.*;
    
/**
 *
 * @author Ethan
 */
public class Polymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // assign three types of values to three variables
        String a = "Hello World!";
        int b = 2 + 2;
        boolean c = true;
        // call a method named 'poly' with the three
        // types of variables
        poly(a);
        poly(b);
        poly(c);
    }
    
    /**
     *
     * @param x becomes the generic value holder for value passed
     * 
     * <p><b>poly</b> is copied 3 times to account for the 3 types of
     * variables that can pass through it.</p>
     */
    
    /* If a string */
    public static void poly(String x){
        System.out.println(x);
    }
    
    /* If an int */
    public static void poly(int x){
        System.out.println(x);
    }
    
    /* If a bool */
    public static void poly(boolean x){
        System.out.println(x);
    }
    
}

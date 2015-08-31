/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passstring;

/**
 *
 * @author Ethan
 */
public class PassString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name  = "Shakespeare";
        
        System.out.println("In main, the name is " + name);
        changeName(name);
        System.out.println("Back in main, the name is "+name);
    }
    
    public static void changeName(String str)
    {
        str="Dickens";
        System.out.println("In changeName, the name is now " + str);
    }
}

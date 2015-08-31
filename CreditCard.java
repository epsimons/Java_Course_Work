package creditcard;


import javax.swing.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package creditcard;

/**
 *
 * @author Ethan
 */
public class CreditCard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double salary;
        int creditRating;
        String input;
        
        input = JOptionPane.showInputDialog("What is "+"your annual salary?");
        salary = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("On a scale of "+"1 through 10, what is your credit rating?\n"+"(10 = excellent, 1 = very bad)");
        creditRating = Integer.parseInt(input);
        creditRating = Integer.parseInt(input);
        
        if(salary >= 20000 && creditRating >= 7)
            qualify();
        else
            noQualify();
        System.exit(0);
    }
    
    public static void qualify()
    {
    JOptionPane.showMessageDialog(null, "Congratulations! "+"You qualify for the credit card.");
    }
    
    public static void noQualify()
    {
        JOptionPane.showMessageDialog(null, "I'm sorry. You "+"do not qualify for the credit card.");
    }
    
}

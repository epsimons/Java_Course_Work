/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roomareas;

import javax.swing.JOptionPane;

/**
 *
 * @author Ethan
 */
public class RoomAreas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double number;
        double totalArea;
        String input;
        
        Rectangle kitchen = new Rectangle();
        Rectangle bedroom = new Rectangle();
        Rectangle den = new Rectangle();
        
        // Get kitchen measurements
        input = JOptionPane.showInputDialog("What is the kitchen's length?");
        number = Double.parseDouble(input);
        kitchen.setLength(number);
        
        input = JOptionPane.showInputDialog("What is the kitchen's width?");
        number = Double.parseDouble(input);
        kitchen.setWidth(number);
        
        // Get Bedroom Measurements
        input = JOptionPane.showInputDialog("What is the bedroom's length?");
        number = Double.parseDouble(input);
        bedroom.setLength(number);
        
        input = JOptionPane.showInputDialog("What is the bedroom's width?");
        number = Double.parseDouble(input);
        bedroom.setWidth(number);
        
        // Get the den measurements
        input = JOptionPane.showInputDialog("What is the den's length?");
        number = Double.parseDouble(input);
        den.setLength(number);
        
        input = JOptionPane.showInputDialog("What is the den's width?");
        number = Double.parseDouble(input);
        den.setWidth(number);
        
        //calculate total area of the rooms
        totalArea = kitchen.getArea() + bedroom.getArea() + den.getArea();
        
        JOptionPane.showMessageDialog(null, "The total area of the rooms is "+totalArea);
        
    }
    
}

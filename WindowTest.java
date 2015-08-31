/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windowtest;


import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Ethan
 */
public class WindowTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       String winTitle = "Java Window Demo";
       String message = "I am made with Java!";
       createWindow(winTitle, message);
     
    }
    public static void createWindow(String name, String msg)
    {
        JFrame frame = new JFrame(name);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel textLabel = new JLabel(msg,SwingConstants.CENTER); textLabel.setPreferredSize(new Dimension(300, 200)); 
        frame.getContentPane().add(textLabel, BorderLayout.CENTER); 
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }
    
}

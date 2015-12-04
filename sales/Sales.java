/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sales;

/**
 *
 * @author Ethan
 */

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Sales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int ONE_WEEK = 7;
        double[] sales = new double[ONE_WEEK];
        
        getValues(sales);
        
        SalesData week = new SalesData(sales);
        DecimalFormat dollar = new DecimalFormat("#,# #0.00");
        
        JOptionPane.showMessageDialog(null, "The total sales were $"+
                dollar.format(week.getTotal())+
                "\nThe average sales were $"+
                dollar.format(week.getAverage())+
                "\nThe highest sales were $"+
                dollar.format(week.getHighest())+
                "\nThe lowest sales were $"+
                dollar.format(week.getLowest()));
        System.exit(0);
    }
    
    private static void getValues(double[] array)
    {
        String input;
        
        for(int i=0;i<array.length; i++)
        {
            input = JOptionPane.showInputDialog("Enter the sales for day "+(i+1)+".");
            array[i] = Double.parseDouble(input);
        }
    }
    
}

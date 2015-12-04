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
public class SalesData {
    private double[] sales;
    
    public SalesData(double[] s)
    {
        sales = new double[s.length];
        
        for(int index = 0; index < s.length; index++)
        {
            sales[index] = s[index];
        }
    }
    
    public double getTotal()
    {
        double total = 0.0;
        for(int index = 0; index < sales.length; index++)
        {
            total += sales[index];
        }
        return total;
    }
    
    public double getAverage()
    {
        return getTotal() / sales.length;
    }
    
    public double getHighest()
    {
        double highest = sales[0];
        
        for(int index =1; index < sales.length;index++)
        {
            if(sales[index]>highest)
                highest = sales[index];
        }
        return highest;
    }
    
    public double getLowest()
    {
        double lowest = sales[0];
        for (int index=1; index < sales.length; index++)
        {
            if (sales[index] < lowest)
                lowest = sales[index];
        }
        return lowest;
        
    }
    
    
}

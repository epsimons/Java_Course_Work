/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roomareas;

/**
 *
 * @author Ethan
 */
public class Rectangle {
    private double length;
    private double width;
    
    public void setLength(double len)
    {
        length = len;
    }
    
    public void setWidth(double w)
    {
        width = w;
    }
    
    public double getLength()
    {
        return length;
    }
    
    public double getWidth()
    {
        return width;
    }
    
    public double getArea()
    {
        return length * width;
    }
}

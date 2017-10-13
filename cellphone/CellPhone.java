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
public class CellPhone {
        
    private String manufact;         // Manufacturer
    private String model;            // Model
    private double retailPrice;      // Retail Price
    
    
    /** 
     * Constructor
     * @param man The phone's manufacturer.
     * @param mod The Phone's model number.
     * @param price The phone's price.
     */
    
    public CellPhone(String man, String mod, double price)
    {
        manufact = man;
        model = mod;
        retailPrice = price;
    }
    
    /*
        The setManufact method sets the phone's
    manufacturer name.
    @param man The Manufacturer.
    */
    
    public void setManufacturer(String man)
    {
        manufact = man;
    }
    
    public void setMod(String mod)
    {
        model = mod;
    }
    
    public String getManufact()
    {
        return manufact;
    }
    
    public String getModel()
    {
        return model;
    }
    
    public double getRetailPrice()
    {
        return retailPrice;
    }
    
}


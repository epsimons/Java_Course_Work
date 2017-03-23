/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import java.io.*;
/**
 *
 * @author Ethan
 */
public class Inheritance {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        loanAgent myLoan = new loanAgent(35000.00,"Mustang");
        double myCost;
        myCost = myLoan.calcRemainder(35000.00);
        System.out.println(myCost);
        
    }
}

class CarDealer
{
   private String name;

   private double price;

   CarDealer(String name, double price)
   {
      this.name = name;
      setPrice(price);
   }

   void addExtras(double price)
   {
      this.price += price;
   }

   String getName()
   {
      return name;
   }

   double getPrice()
   {
      return price;
   }

   void setPrice(double price)
   {
      this.price = price;
   }
}

class loanAgent extends CarDealer
{
   loanAgent(double loan, String name)
   {
      super("CarDealer", loan);
   }

   
   double calcRemainder(double cost){
       setPrice(cost);
       double tempDouble = getPrice();
       return tempDouble;
   }
}

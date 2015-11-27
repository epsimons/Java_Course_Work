/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searcharray.java;

/**
 *
 * @author Ethan
 */
public class SearchArrayJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] tests = { 87, 75, 98, 100, 82 };
       int results;
       
       // Search array for value 100
       results = sequentialSearch(tests,100);
       
       //Determine if 100 was found and display
       // an appropriate message
       if (results == -1)
       {
           System.out.println("You did not earn 100 on any test.");
       }
       else
       {
           System.out.println("You earned 100 on test #"+(results+1));
       }
    }
    
    public static int sequentialSearch(int[] array, int value)
{
    int index;      //loop control variable
    int element;    // Element the value found at
    boolean found;  // Flag indicating search results
    
    index = 0; // 0 is starting point of search
    element = -1; 
    found = false;
    
    //search the array
    while(!found && index < array.length)
    {
        if(array[index] == value)
        {
            found = true;
            element = index;
        }
        index++;
    }
    return element;
}
    
}

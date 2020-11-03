/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewPr1;

/**
 *
 * @author Harsh
 */
public class LastIndex4 {
   
public static void main(String args[]) 
    { 
  
        // Initialising String 
        String Str = new String("Welcome geeks to geeksforgeeks"); 
  
        System.out.print("Found substring geeks at : "); 
  
        // start index of last occurrence of "geeks' 
        // before 15 
        // prints 11 
        System.out.println(Str.lastIndexOf("geeks", 15)); 
    } 
}

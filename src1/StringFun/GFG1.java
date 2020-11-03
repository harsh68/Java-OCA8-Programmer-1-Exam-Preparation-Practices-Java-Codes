/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringFun;

/**
 *
 * @author Harsh
 */

public class GFG1 { 
    public static void main(String[] argv) 
        throws Exception 
    { 
        // create a StringBuilder object 
        // with a String pass as parameter 
        StringBuilder str = new StringBuilder("AAAABBBCCCC"); 
        str.append("pqr");
        System.out.println(str);
        
        String str_1 = "India";
        str_1.concat("pqr");
        System.out.println(str_1);
        
     // print string 
        System.out.println("String = " + str.toString()); 
  
        // reverse the string 
        StringBuilder reverseStr = str.reverse(); 
       
        // print string 
        System.out.println("Reverse String = " + reverseStr.toString()); 
  
        // Append ', '(44) to the String 
        str.appendCodePoint(44); 
  
        // Print the modified String 
        System.out.println("Modified StringBuilder = "+ str); 
  
        // get capacity 
        int capacity = str.capacity(); 
  
        // print the result 
        System.out.println("StringBuilder = " + str); 
        System.out.println("Capacity of StringBuilder = "+ capacity); 
    
              } 
} 

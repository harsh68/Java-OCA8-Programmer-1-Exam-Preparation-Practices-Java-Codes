/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wrappers;

/**
 *
 * @author Harsh
 */
public class Comaparision {
    public static void main(String[] args) {
      //Unwrapper and then rewrap
      
      Integer i1 = 20;
      int x = i1.intValue(); //unwrap
      x++;
      i1= new Integer(x);//rewrap
        
      /*
      
      in java compiler 
      Autoboxing is the automatic conversion that the 
      Java compiler makes between the primitive types and their corresponding object wrapper classes.
      For example, converting an int to an Integer, 
      a double to a Double, and so on.
      If the conversion goes the other way, this is called unboxing.
      
      
      Autoboxing: primitive to Wrapper class
      Unboxing: Wrapper to primitive
      */
      int a =20;
      Integer i2 = a; //Autoboxing :line 39
      
      //what compiler perform for this
      
      Integer i3 = Integer.valueOf(a); //
      
      
    }
    
}

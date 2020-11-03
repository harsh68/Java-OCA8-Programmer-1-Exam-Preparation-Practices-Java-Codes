/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package values;
import java.lang.Number.*;
/**
 *
 * @author Harsh
 */
public class DataSize {
    public static void main(String[] args) {
      System.out.println("Integer Datatype values...");
      System.out.println("Min = " + Integer.MIN_VALUE);
      System.out.println("Max = " + Integer.MAX_VALUE);

      System.out.println("Float Datatype values...");
      System.out.println("Min = " + Float.MIN_VALUE);
      System.out.println("Max = " + Float.MAX_VALUE);

      System.out.println("Double Datatype values...");
      System.out.println("Min = " + Double.MIN_VALUE);
      System.out.println("Max = " + Double.MAX_VALUE);

      System.out.println("Byte Datatype values...");
      System.out.println("Min = " + Byte.MIN_VALUE);
      System.out.println("Max = " + Byte.MAX_VALUE);

      System.out.println("Short Datatype values...");
      System.out.println("Min = " + Short.MIN_VALUE);
      System.out.println("Max = " + Short.MAX_VALUE);
      
    System.out.println("Size of byte: " + (Byte.SIZE/8) + " bytes.");
    System.out.println("Size of short: " + (Short.SIZE/8) + " bytes.");
    System.out.println("Size of int: " + (Integer.SIZE/8) + " bytes.");
    System.out.println("Size of long: " + (Long.SIZE/8) + " bytes.");
    System.out.println("Size of char: " + (Character.SIZE/8) + " bytes.");
    System.out.println("Size of float: " + (Float.SIZE/8) + " bytes.");
    System.out.println("Size of double: " + (Double.SIZE/8) + " bytes.");
   }

}

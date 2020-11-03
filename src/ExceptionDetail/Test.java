/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionDetail;

import java.io.IOException;

/**
 *
 * @author Harsh
 */
class ReadTheFile {
     static void print() throws Exception{ //Line 4
         throw new IOException(); //Line 5
     }
}
 
public class Test {
     public static void main(String[] args) { //Line 10
         try
         {
         ReadTheFile.print(); //Line 11
         //Line 12
         }
         catch(IOException i)
         {
             System.out.println("io");
         }
         catch(Exception e)
         {
             System.out.println("caught");
         }
     }
}
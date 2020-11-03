/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception_details;

import java.io.IOException;

/**
 *
 * @author Harsh
 */
class ReadTheFile {
     static void print() throws IOException{ //Line 4
         throw new IOException(); //Line 5
     }
}
 
public class Excet {
     public static void main(String[] args) throws Exception { //Line 10
         try
         {
         ReadTheFile.print(); //Line 11
         //Line 12
         }
         catch(IOException i)
         {
             
         }
     }
}
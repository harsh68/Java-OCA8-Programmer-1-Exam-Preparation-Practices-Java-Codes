/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomeException;

import java.io.IOException;

/**
 *
 * @author Harsh
 */
public class ThrowExce_checked {
    
static void fun() throws IOException //its compulsory for Checked Exception with throws
  {
      try
      {
          throw new IOException("Hellos");
      }
      catch(IOException e)
      {
          System.out.println("Caught in Fun method");
          throw e;
      }
  }
  
    public static void main(String[] args) {
        try
        {
            fun();
        }
        catch(IOException e)
        {
            System.out.println("caught in Main");
        }
    }
}

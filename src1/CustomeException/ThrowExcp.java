/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomeException;

/**
 *
 * @author Harsh
 */
public class ThrowExcp {
  static void fun()
  {
      try
      {
          throw new RuntimeException("Hellos");
      }
      catch(RuntimeException e)
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
        catch(RuntimeException e)
        {
            System.out.println("caught in Main");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Harsh
 */
public interface Animal
{
    public default String getName() 
    {
        return null; 
    }
}
 interface Mammal 
 {
     public default String getName()
     {
         return null;
     }
 }
  abstract class Otter implements Mammal, Animal
  {
       public String getName()
       {
           return null;
       }
  }

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gc;

/**
 *
 * @author Harsh
 */
class A2
{
    int i = 50;
 
    @Override
    protected void finalize() throws Throwable
    {
        System.out.println("From Finalize Method");
    }
}
 
public class Test2
{
   public static void main(String[] args)
   {
      //Creating two instances of class A
 
      A a1 = new A();
 
      A a2 = new A();
 
      //Assigning a2 to a1
 
      a1 = a2;
 
      //Making finalize() method to execute forcefully
       
      Runtime.getRuntime().runFinalization();
 
      System.out.println("done");
   }
}
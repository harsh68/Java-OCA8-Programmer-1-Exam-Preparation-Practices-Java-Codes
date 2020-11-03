/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectCast;

/**
 *
 * @author Harsh
 */


public class ClassCast extends Xmas {
      public static void main(String[] args) {
        Xmas x1 = new Xmas();
        ClassCast c1 = new ClassCast();
        //ClassCast c2 = (ClassCast)x1;
        //Xmas x2 = (Xmas)c1;     
        
        Xmas d1 = new ClassCast();
        //d1.itley();
        /*Xmas f1 = (Xmas)d1;
        f1.itley();
        f1.d2();*/
        
        ClassCast d2 = (ClassCast)d1;
        d2.d2();
        d2.itley();
        d2.nwz();
        //ClassCast c5 =(ClassCast) d1;
        
      }
      @Override
      void itley()
      {
          System.out.println("sub");
      }
      void nwz()
      {
          System.out.println("78");
      }
}
class Xmas
{
    void d2()
    {
        System.out.println("9");
    }
    void itley()
    {
        System.out.println("sup");
    }
    
}
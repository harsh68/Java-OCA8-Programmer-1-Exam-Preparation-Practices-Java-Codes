/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor_values;

/**
 *
 * @author Harsh
 */
class ConsSuper
 {
    ConsSuper()
    {
        System.out.println("Super constructor");
    }
     static{
        System.out.println("static block in super class");
    }
    {
        System.out.println("Initialization block superclass-0");
    }
     {
        System.out.println("Initialization block superclass-1");
    }
     void Nowork(){System.out.println("never print");}
     
      {
        System.out.println("Initialization block superclass-2");
    }
      void Nowork2(){System.out.println("never print");}
 }
 class ConsSub extends ConsSuper
 {
    // what calls first constructor or static block or initialization block
    ConsSub()
    {
        System.out.println("Sub Constructor");
    }
    static{
        System.out.println("static block in sub class");
    }
    {
        System.out.println("Initialization block subclass");
    }
 }
 public class Constructor {

    public static void main(String[] args) {
        ConsSub cs = new ConsSub();
     }
    
 }

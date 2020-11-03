/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casting;

/**
 *
 * @author Harsh
 */
 class A {
    void hello()
    {
        System.out.println("super");
    }
}
class B extends A
{
    void hello()
    {
        System.out.println("sub");
    }
}
class F
{
    
}
public class NewClass {
    public static void main(String[] args) {
        A ob = new B();
        ((B)ob).hello();
        ((A)ob).hello();
        if(ob instanceof A){System.out.println("ob instance of A is true");}
        if(ob instanceof B){System.out.println("ob instance of B is true");}
        
        
        B ob2 = new B();
         ((B)ob2).hello();
         ((A)ob2).hello();
         
          if(ob2 instanceof A){System.out.println("ob2 instance of A is true");}
          if(ob2 instanceof B){System.out.println("ob2 instance of B is true");}
          
             A ob3 = new A();
            // ((B)ob3).hello();
             ((A)ob3).hello();
              if(ob3 instanceof A){System.out.println("ob3 instance of A is true");}
              if(ob3 instanceof B){System.out.println("ob3 instance of B is true");}
           //   if(ob2 instanceof F){}
    }
}



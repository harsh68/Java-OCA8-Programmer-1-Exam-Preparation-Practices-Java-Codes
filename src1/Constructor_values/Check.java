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
public class Check {
    int a;
    Check(){}
    Check(Check c1){
        c2 = c1;
        c2.display();
        c1.display();
      // System.out.println("yo"+c1.c2.a);
    }
    Check c2;
    void display()
    {
        System.out.println(a);
        
    }
    public static void main(String[] args) {
        Check c4 = new Check();
          c4.a =10;
        Check c5 = new Check(c4);
       // if(c5==c4){System.out.println("same");}
        //if(c5.c2==c4.c2){System.out.println("new same");}
        System.out.println("Memory"+c5.c2.a);        
    }
}

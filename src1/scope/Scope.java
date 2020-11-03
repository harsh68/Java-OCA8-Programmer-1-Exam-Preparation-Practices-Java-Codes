/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scope;

/**
 *
 * @author Harsh
 */

class Pqr11
{
    static int a =10;
    void display()
    {
        int a =34;
        System.out.println(a);
    }
}
public class Scope {

    /**
     * @param args the command line arguments
     */
       int a =10;
      void display()
      {
        int a =34;
        System.out.println(a);
      }
    
    public static void main(String[] args) {
        Scope s = new Scope();
        s.display();
    }
    
}

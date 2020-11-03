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
interface f1
{
    int A = 9;
    void news();
    default void def(){System.out.println("in interface f1");}
}
interface f2
{
     int A = 15;
    void news();
    default void def(){System.out.println("in interface f2");}
}
public class Interface4 implements f1,f2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Interface i = new Interface();
        i.def();
    }

    @Override
    public void news() {
        System.out.println("value of a"+f2.A);
    }
    
     @Override
    public void def() {
         System.out.println("Override def");
    }
   
}

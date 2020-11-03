/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lambda;

/**
 *
 * @author Harsh
 */
interface L1
{
    void display(int f);
}
public class Lamda 
{
    
    
  /*  public static void main(String[] args) {
        L1 l1 = (int f)-> {for(f=0;f<5;f++){System.out.println(f);}};
        l1.display(5);
    }*/
    public static void main(String args[]) 
    { 
        // lambda expression to implement above 
        // functional interface. This interface 
        // by default implements abstractFun() 
       // FuncInterface fobj = (int b)->{System.out.println(2*b);System.out.println("Separate");}; 
        L1 fobj = (int b)->{for(b=0;b<5;b++){System.out.println(2*b);System.out.println("Separate");}}; 
        // This calls above lambda expression and prints 10. 
        fobj.display(15); 
        
    } 
}

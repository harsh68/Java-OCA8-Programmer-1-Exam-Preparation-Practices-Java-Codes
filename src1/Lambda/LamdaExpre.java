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

   interface FuncInterface 
{ 
    // An abstract function 
    void abstractFun(int a);
} 
  
class LamdaExpre
{ 
    public static void main(String args[]) 
    { 
        // lambda expression to implement above 
        // functional interface. This interface 
        // by default implements abstractFun() 
       // FuncInterface fobj = (int b)->{System.out.println(2*b);System.out.println("Separate");}; 
   FuncInterface fobj = (int b)->{for(b=0;b<5;b++){System.out.println(2*b);System.out.println("Separate");}}; 
        // This calls above lambda expression and prints 10. 
        fobj.abstractFun(15); 
        
    } 
} 
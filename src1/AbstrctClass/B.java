/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstrctClass;

/**
 *
 * @author Harsh
 */
abstract class A { 
    protected void method() 
    { 
        System.out.println("Hello1"); 
    } 
    abstract void news();
} 
  
public class B extends A { 
    
    @Override
    public void method() 
    { 
        System.out.println("Hello2"); 
    } 
    
    @Override
    protected void news()     
    {
        System.out.println("New2");
    }
  
    public static void main(String args[]) 
    { 
        A b = new B(); 
        b.method(); 
        b.news();
    } 
} 
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
public class ScopeofVariable {

    static int x = 11; 
    private int y = 33; 
    public void method1(int x) 
    { 
        ScopeofVariable t = new ScopeofVariable(); 
        this.x = 22; 
        y = 44; 
        System.out.println("Test.x: " + ScopeofVariable.x); 
        System.out.println("t.x: " + t.x); 
        System.out.println("t.y: " + t.y); 
        System.out.println("y: " + y); 
    } 
  
    public static void main(String args[]) 
    { 
        ScopeofVariable t = new ScopeofVariable(); 
        t.method1(5); 
        System.out.println("Now in main t object : "+t.y);
    } 
} 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Harsh
 */
public class New2{
   
    void display()
    {
        New1 ob = new New1();
        ob.a = 5; // Protected member in same package behave like default access modifier
        ob.b = 10; // default access modifier but same package
        
    }
    
}

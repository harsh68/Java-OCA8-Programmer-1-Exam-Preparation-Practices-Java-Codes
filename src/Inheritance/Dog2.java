/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

import java.io.IOException;

/**
 *
 * @author Harsh
 */
class Ani2
{
    public void eat() throws IOException
    {
        System.out.println("P");
    }
}
public class Dog2 extends Ani2 {
    @Override
    public void eat(){System.out.println("H");}
    public static void main(String a[]) 
    {
        Ani2 a1 = new Dog2();
        //a1.eat(); //Super type reference to subtype object 
                  // super type overriden method declared check exception 
                  // compiler thinks that method declared exception
    }
}

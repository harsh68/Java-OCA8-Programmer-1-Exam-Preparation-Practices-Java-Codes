/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author Harsh
 */

class A
{
    int a =10;
    static void happy()
    {
        System.out.println("Hello");
    }
    void happy2()
    {
        System.out.println("Hello non static");
    }
}
class B extends A
{
    int a =15;
    static void happy()
    {
        System.out.println("World");
    }
    
    void happy2()
    {
        System.out.println("World non static");
    }
}
public class StaticOverride {
    public static void main(String[] args) {
       A ob = new B();
       ob.happy();
       ob.happy2();
        System.out.println("value of a"+ ob.a);
    }
}

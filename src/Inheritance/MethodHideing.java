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
class M1
{
     static void display()
    {
        System.out.println("Method hiding parent");
    }
}
class M2 extends M1
{
    //Method hiding rule same as Overriding and one more about static keyword required in both classes (P and C)
    static void display()
    {
        System.out.println("Method Hiding in CHild");       
    }
}
public class MethodHideing {
    public static void main(String[] args) {
        M1 ob = new M2();
        ob.display();
    }
}

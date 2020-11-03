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
class Vec
{
    static void new1()
    {
        System.out.println("hello");
    }
}
class Vec1 extends Vec
{
     
     static void new1()
    {
        System.out.println("world");
    }
}
public class Exp {
    public static void main(String a[])
    {
        Vec n = new Vec1();
        n.new1();
    }
}

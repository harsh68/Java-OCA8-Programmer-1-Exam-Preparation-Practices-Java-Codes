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
class Demo
{
    static int Cal(int x,int y)
    {
        return (x+y);
    }
}
public class Inhertit extends Demo {
    public static void main(String a[])
    {
        int g =7;
        //Demo d = new Demo();
        System.out.println(Cal(g,7));
    }
    
}

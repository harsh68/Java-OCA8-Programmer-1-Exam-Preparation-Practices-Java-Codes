/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overriding;

/**
 *
 * @author Harsh
 */
class Aa1
{
    void display()
    {
        System.out.println("Hello");
    }
}
class Bb1 extends Aa1
{
    void display()
    {
        System.out.println("world");
    }
}
public class Callcast {
    public static void main(String[] args) {
        Aa1 ob = new Bb1();
        Bb1 ob1 = new Bb1();
        ob.display();
        ((Aa1)ob1).display();
    }
}

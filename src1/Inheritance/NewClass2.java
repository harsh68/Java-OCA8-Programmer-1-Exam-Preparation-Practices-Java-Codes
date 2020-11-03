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
abstract class I
{
    abstract void display();
}
class A1 extends I
{
    @Override
    public void display()
    {
        System.out.println("method");
    }
    void metodA()
    {
        System.out.println("Method A");
    }
}
public class NewClass2 {
    public static void main(String a[])
    {
        I ob = new A1();
        ob.display();
        //ob.metodA();
        
    }
}


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
interface i
{
    void display();
}
class A implements i
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
public class NewClass1 {
    public static void main(String a[])
    {
        i ob = new A();
        ob.display();
        //ob.metodA();
        
    }
}

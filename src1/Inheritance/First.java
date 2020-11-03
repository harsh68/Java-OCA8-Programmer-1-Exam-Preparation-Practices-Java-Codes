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
interface New
{
    void display();
}
class Second1 implements New
{
    @Override
    public void display()
    {
        System.out.println("New");
    }
}
class Second2 extends Second1
{
    void dis()
    {
        super.display();
    }
}
public class First {
    public static void main(String a[])
    {
        Second2 e = new Second2();
        e.dis();
        
    }
}

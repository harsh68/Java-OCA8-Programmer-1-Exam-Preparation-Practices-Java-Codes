/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;

/**
 *
 * @author Harsh
 */
class Poly 
{
    void display()
    {
        System.out.println("Hellos in Poly");
    }
}
class Poly2 extends Poly
{
    @Override
    void display()
    {
        System.out.println("Hellos in Poly2");
    }
}
class PolyTest extends Poly2
{
    @Override
    void display()
    {
        System.out.println("Hellos in PolyTest");
    }
}
public class TestMethod {
    
    public static void main(String...args)
    {
    PolyTest pt = new PolyTest();
    pt.display();    
    }
    
    
}

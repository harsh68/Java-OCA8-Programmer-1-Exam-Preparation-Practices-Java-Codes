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
class Sup
{
    private void display()
    {
        System.out.println("sup");
    }
}
class Sub extends Sup
{
    Sub()
    {
        Sup sp = new Sub();
        sp.display();
    }
    private void display()
    {
        System.out.println("sub");
    }
}
public class PrivateOverride {
    public static void main(String[] args) {
        
    }
}

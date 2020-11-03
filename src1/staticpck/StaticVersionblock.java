/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticpck;

/**
 *
 * @author Harsh
 */

    
class A13
{
    static
    {
        System.out.println("Fist");
    }
}
public class StaticVersionblock extends A13 {
    static 
    {
        System.out.println("second");
        
    }
    public static void main(String[] args) {
        
    }
}

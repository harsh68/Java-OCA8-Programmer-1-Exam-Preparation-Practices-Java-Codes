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

public class Blocks extends Asb{
    static
    {
        System.out.println("p");
    }
    public static void main(String[] args) {
        
    }
}
class Asb
{
    final static int y;
    static
    {
        y= 45;
        System.out.println("h");
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;
import java.io.IOException;
import java.sql.SQLException;
/**
 *
 * @author Harsh
 */
class Ani
{
    void re() throws ArithmeticException
    {
        System.out.println("eat");
    }
}
public class Des extends Ani {
    @Override
    void re() throws NumberFormatException
    {
        System.out.println("not");    
    }
    public static void main(String a[]) throws Exception
    {
        //Des d = new Des();
        //Ani a1 = new Ani();
        Ani b = new Des();
        b.re();
        //d.re();
        //a1.re();
        
    }
    
}

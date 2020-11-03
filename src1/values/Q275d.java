/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package values;

/**
 *
 * @author Harsh
 */
public class Q275d
{
    public static int a;
    private int b;
    
    public Q275d()
    {
        int c;
        c = a; // (1)
        a++; // (2)
        b += c; // (3)
        a -= b; // (4)
        System.out.println("a:"+a+b+c);
    }
    public static void main(String[] args)
    {
    new Q275d();
    }
}

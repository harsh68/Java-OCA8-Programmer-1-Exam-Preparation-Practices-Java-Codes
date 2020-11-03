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
class Origin
{
    static int a =10;
    static
    {
        a=50;
    }
}
public class Stativalue {
    public static void main(String[] args) {
        Origin o = new Origin();
        System.out.println("o  a:"+Origin.a);
        Origin.a = 300;
        Origin oo = new Origin();
        oo.a = 100;
        System.out.println("oo  a:"+o.a);
    }
}

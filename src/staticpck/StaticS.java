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
class Vindo
{
    static int a;
    void weafer()
    {
        System.out.println("a:"+a);
        System.out.println("a:"+Vindo.a);
    }
}
public class StaticS {
    void newsd()
    {
        System.out.println("a: "+Vindo.a); // static a is for only StaticS class
        System.out.println("a: "+Vindo.a);
    }
    static void newsF()
    {
        System.out.println("a: "+Vindo.a); // static a is for only StaticS class
        System.out.println("a: "+Vindo.a);
    }
    public static void main(String[] args) {
        
    }
}

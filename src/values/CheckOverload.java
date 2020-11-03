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
class CharSe
{
    void dis(CharSequence str)
    {
        System.out.println("char sequence");
    }
    void dis(Double do2)
    {
        System.out.println("souble");
    }
    void dis(String s)
    {
        System.out.println("string");
    }
    void dis(Double d,Double d1)
    {
        System.out.println("in Double 2 par");
    }
    void dis(double d1,double d2)
    {
        System.out.println("in double 2 par");
    }
}
public class CheckOverload extends CharSe{
    public static void main(String[] args) {
        //new CheckOverload().dis(null);
        double d = 3.44d;
        float f =3.44f;
        d=f;
        int i =(int)d;
        new CheckOverload().dis(10.0,new Integer(10));
        //new CheckOverload().dis(10);
        System.out.println(new Integer(10));
    }
}

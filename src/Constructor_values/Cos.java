/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor_values;

/**
 *
 * @author Harsh
 */
class Digital
{
    String s;
    Digital(String s)
    {
        this.s = s;
    }
    Digital()
    {
        this(display());//this() use static variable and method
    }
    static String display()
    {
        int i = (int)(Math.random()*5);
        String name = new String[]{"In","Out","Above","Behind","Back","Fronf"}[i];
        return name;
    }
            
}
public class Cos {
    public static void main(String a[])
    {
        Digital d1 = new Digital();
        System.out.println(""+d1.s);
        Digital d2 = new Digital("Hello");
        System.out.println(d2.s);
    }
}

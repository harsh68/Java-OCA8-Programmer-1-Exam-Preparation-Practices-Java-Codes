/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Output;

/**
 *
 * @author Harsh
 */
public class Check {
    String s;
    Check(String s)
    {
        this.s =s;
    }
    public static void main(String a[])
    {
       Check c1 = new Check("Million");
       Check c2 = new Check("Million");
       String s1 = new String("harsh");
       String s2 = new String("harsh");
       if(c1==c2)
       {
           System.out.println("1");
       }
       if(c1.equals(c2))
       {
           System.out.println("2");
       }
        if(s1.equals(s2))
       {
           System.out.println("*");
       }
       c1=c2;
       if(c1==c2)
       {
           System.out.println("3");
       }
       c1.s = "h";
       c2.s = "p";
       if(c1.equals(c2))
       {
           System.out.println("4");
       }
        System.out.println("c1.s is"+c1.s);
        System.out.println("c2.s is"+c2.s);
        c2 = new Check("ok");
        System.out.println("c1.s is"+c1.s);
        System.out.println("c2.s is"+c2.s);
    }
    
}

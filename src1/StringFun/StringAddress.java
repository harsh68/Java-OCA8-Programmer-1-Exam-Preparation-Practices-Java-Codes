/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringFun;

/**
 *
 * @author Harsh
 */
class Abc
{
    int a,b;
    String c;
    Abc(){}
    Abc(int a,int b,String c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
public class StringAddress {
    public static void main(String[] args) {
        
        String s = new String("Hello");
        System.out.println(s);
        System.out.println(s.hashCode());
        s=null;
        String s1 = new String("Hello");
        System.out.println(s1.hashCode());
        
        Abc ob = new Abc(12,14,"Hello");
        System.out.println(ob);
        ob=null;
        Abc ob2 = new Abc(12,14,"Hello");
        System.out.println(ob2);
        
        String s8= "abc";
        String s9 = new String("abc");
        String s10= "abc";


    System.out.println(Integer.toHexString(s8.hashCode()));
    System.out.println(Integer.toHexString(s9.hashCode()));
    System.out.println(Integer.toHexString(s10.hashCode()));
        System.out.println(s8==s9);
        
    }
}

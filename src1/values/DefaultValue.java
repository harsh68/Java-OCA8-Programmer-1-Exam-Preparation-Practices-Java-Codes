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
class Val
{
    byte a;
    static byte b;
    short s;
    static short s2;
    Val v;
    static Val v1;
}
public class DefaultValue {
    public static void main(String[] args) {
        Val v = new Val();
        System.out.println("non static instance byte "+v.a);
         System.out.println("static instance byte "+Val.b);
          System.out.println("non static instance short "+v.s);
           System.out.println("static instance short "+Val.s2);
            System.out.println("Reference  "+v.v);
            System.out.println("Static Reference  "+Val.v1);
    }
}

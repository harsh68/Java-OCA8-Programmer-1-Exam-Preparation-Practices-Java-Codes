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
public class NewClassS {
    static int a ;
    int b,d;
    final static int c;
    static
    {
       c=45;
     //  c=33;
       //d=45;
    }
    void assign()
    {
        a=b;
    }
    public static void main(String[] args) {
        NewClassS nc = new NewClassS();
        nc.b=20;
        nc.assign();
        System.out.println("a:"+ a);
    }
}

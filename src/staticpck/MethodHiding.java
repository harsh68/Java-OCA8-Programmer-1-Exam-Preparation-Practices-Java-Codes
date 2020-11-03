package staticpck;


import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Harsh
 */
class A
{
    static int a =56;
    public static void newr() throws IOException
    {
        System.out.println("class A a: "+a);
    }
}
class B extends A
{
    
     static int a =60;
   // void newr(){} //must be static keyword overload
   // static void newr() throws Exception{} //cant throw checked new or broader comapre to static
   // protected static void newr() //broader accessible
    public static void newr() throws ArithmeticException
    {
        System.out.println("class B a: "+a);   
    }

    
}
public class MethodHiding {
    public static void main(String[] args) throws IOException {
        A ob = new B();
        ob.newr();
        
    }
}

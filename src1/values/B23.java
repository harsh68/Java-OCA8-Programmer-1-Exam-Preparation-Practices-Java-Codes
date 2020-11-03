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
class A23
{
    int a =5;
    String doA(){return "a1";}
    protected static String doA2(){return "a2";}
}
public class B23 extends A23{
    int a =7;
    @Override
    String doA()
    {
        System.out.println(a);
        return "b1";
    }
    public static String doA2(){return "b2";}
    
    void go()
    {
        System.out.println("a: "+a);
        A23 myA = new B23();
        System.out.println(myA.doA()+myA.doA2()+myA.a);
    }
    public static void main(String[] args) {
        new B23().go();
        A23 hj = new B23();
        System.out.println(hj.a);
    }
}

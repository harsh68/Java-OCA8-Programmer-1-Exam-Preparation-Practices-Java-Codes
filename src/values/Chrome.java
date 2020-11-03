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
class X
{
    void do1(){}
}
class Y extends X
{
    void do2()
    {
        
    }
}
public class Chrome {
    public static void main(String[] args) {
        X x1 = new X();
        X x2 = new Y();
        ((Y)x2).do2();
    }
}

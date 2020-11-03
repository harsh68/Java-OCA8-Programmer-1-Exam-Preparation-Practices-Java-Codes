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
class Pqr1
{
    int b=10;
    Pqr1(){}
    Pqr1(int a)
    {
        
    }
    void dis2()
    {
        System.out.println(b);
    }
    
}
class Abc1 extends Pqr1
{
   int b =30;
    Abc1()
    {
        //super(super.b);
    }
    void dis()
    {
        super.b =20;
        super.dis2();
        System.out.println(b);
    }
}
public class NewClass2 {
    public static void main(String...a)
    {
        Abc1 ob = new Abc1();
        ob.dis();
        ob.dis2();
    }
}

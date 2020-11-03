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
class Pqr1
{
    String x = "abc";
    int a =10;
    public void show()
    {
        System.out.println(this.x);
        System.out.println(a);
    }
}
public class Abc1 extends Pqr1 {
    String x = "pqr";
    int a = 20;
    @Override
     public void show()
    {
        System.out.println(x);
        System.out.println(a);
    }
     public static void main(String[] args) {
        Pqr1 ob = new Abc1();
        ob.show();
         System.out.println(ob.x);
         System.out.println(ob.a);
    }
}

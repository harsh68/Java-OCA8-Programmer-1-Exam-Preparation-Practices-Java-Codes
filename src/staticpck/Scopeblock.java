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
class Demo1
{
     int a;
     int x3;
    {
        x3 = 40;
        int b=23;
    }
    void display()
    {
        System.out.println("a: "+a+"x3: "+ x3);
    //    System.out.println("b:"+b);
    }
}
public class Scopeblock {
    public static void main(String[] args) {
        new Demo1().display();
    }
}

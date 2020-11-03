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

class hello{
    
    
    public int a;
    public hello(int a)
    {
        this.a =a;
    }  
    public int retval()
    {
        return a;
    }
    public void change(int x)
    {
        a +=x;
    }
}

public class ValueWithThis {
    public static void main(String[] args) {
        hello vt = new hello(12);
        hello vt2 = new hello(21);
        //vt.a=0;
        System.out.println("value is one"+vt.a);
      //vt.change(-vt.a);
      vt.change(0);
        System.out.println("value is"+vt.a);
    }
}

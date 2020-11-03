/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewPr1;

/**
 *
 * @author Harsh
 */


    class Base 
    {
        protected int i;
        Base() 
        { 
            add(1); 
            //f();
        }
        void add(int v) 
        { 
            i += v;
            //System.out.println("super:"+i);
        }
        void print()
        {
            System.out.println(i);
        }
   }

class Extension extends Base
{
    Extension() { add(2); }
    void add(int v) 
    { 
        System.out.println("return i:"+i);
        i += v*2;
        System.out.println("value of i:"+i);
    }
    void f()
    {
        
    }
}

public class Qd073
{
    public static void main(String[] args) {
        bogo(new Extension());
}

    static void bogo(Base b) {
        b.add(8);
        b.print();
    }
}

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
interface Foo2
{
    
}
class Aa2 implements Foo2
{
    
}
class Bb2 extends Aa2
{
    
}

public class Inter1 {
    public static void main(String[] args) {
        Foo2 f = new Aa2();
        Bb2 b = new Bb2();
        Aa2 a = new Bb2();
        Foo2 f1 = new Bb2();
        Aa2 a2 = new Aa2();
        int []num = null;
        String s = null;
        String s2 = "True";
        int []num1 = new int[4];
        if(f instanceof Foo2){System.out.println("Yes1");}
        if(b instanceof Aa2){System.out.println("Yes2");}
        if(a instanceof Bb2){System.out.println("Yes3");}
        if(a instanceof Aa2){System.out.println("Yes4");}
        if(a2 instanceof Bb2){System.out.println("Yes5");} //False
        if(a2 instanceof Foo2){System.out.println("Yes6");}
        if(num instanceof Object){System.out.println("Yes7");}//False
        if(s instanceof Object){System.out.println("Yes8");}//False
        if(num1 instanceof Object){System.out.println("Yes9");}
        if(s2 instanceof Object){System.out.println("Yes10");}
    }
}

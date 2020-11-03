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
interface west
{
    void display();
}
class GameShpae2
{
    static int a =10;
    public static void exp()
    {
        System.out.println("super- exp");
    }
    public void shaper()
    {
        System.out.println("Display Shape");
    }        
}

public class TestShape3 extends GameShpae2 implements west {
    static int a = 20;
    public void display()
    {
        System.out.println("display override");
    }
    
    @Override
    public void shaper()
    {
        System.out.println("Display Shape but in subclass");
    } 
    public static void exp()
    {
        System.out.println("sub- exp");
    }
    
    public void notToother()
    {
        System.out.println("Cant call dynamically");
    }
    public static void main(String a[])
    {
        TestShape3 ts = new TestShape3();
        ts.display();
        ts.shaper();
        
        Object o = ts;
       // o.display();
        //o.shaper();
        west w = ts;
        w.display();
        //w.shaper();
        GameShpae2 gs = ts;
        //gs.display();
        gs.shaper(); // called overriden method dynamically (but not variable or static method)
        System.out.println(gs.a); //10 //only overriden method call not variable or static methods
        System.out.println(ts.a); //20
        gs.exp(); //super class not overriden (only overriden instance method dynamically called
        ts.exp(); //sub
        exp(); //sub
        //gs.notToother(); // only inherited method invoked and notToother is not available in animal calss
    }
}
/*but at runtime, the ONLY things that are dynamically selected based on the
actual object (rather than the reference type) are instance methods.

Not static methods. Not variables. Only overridden
instance methods are dynamically invoked based on the real object’s type.*/
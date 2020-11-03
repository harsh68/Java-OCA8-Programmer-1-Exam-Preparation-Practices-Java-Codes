/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author Harsh
 */
class Q
{
    int a;
    int d =56;
    Q()
    {
        a=5;
    }
    public void a()
    {
        
    }
}
class F extends Q
{
    int d =90;
    
}
class H extends F
{
    int d = 55;
}
class T extends H
{
    int d =11;
    void check()
    {
        System.out.println("which d?"+super.d);
    }
}
public class Typeaccess extends Q{
    int s =45;
    @Override
    public void a()
    {
        
    }
    void news()
    {
        System.out.println(super.a);
        System.out.println(this.a);
        System.out.println(a);
        //System.out.println(super.s);
    }
    public static void main(String[] args) {
        Typeaccess tq = new Typeaccess();
        tq.news();
        System.out.println(tq.a);
        
        T t = new T();
        t.check();
    }
}

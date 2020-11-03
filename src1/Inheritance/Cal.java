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
class Super
{
    int a =20;
    void display(){
        System.out.println("super-dis");}
    void unique()
    {
        System.out.println("unique");
    }
}
class Sub extends Super
{
    int a = 10;
    @Override
    void display()
    {
        System.out.println("sub-display");
    }
    void news()
    {
        System.out.println("sub news");
    }
}
public class Cal {
    public static void main(String a[])
    {
        Super ob = new Sub();
        ob.display();;
        ob.unique();
        //ob.news();
        System.out.println(ob.a);
    }
}

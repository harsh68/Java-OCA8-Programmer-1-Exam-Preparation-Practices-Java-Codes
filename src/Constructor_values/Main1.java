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
class ConstSuper
{
    String hello;
    public ConstSuper(String hello) { this.hello = hello;}
}
class ConstSub extends ConstSuper
{
    static String world = "world";
    public ConstSub()
    {
        super(getStaticString());
    }
    public String getString() { return "world"; } 
    public static String getStaticString() { return "world"; }
}
class Main1
{
    public static void main(String a[])
    {
        ConstSub ob = new ConstSub();
        System.out.println(ob.getString( ));
    }
}

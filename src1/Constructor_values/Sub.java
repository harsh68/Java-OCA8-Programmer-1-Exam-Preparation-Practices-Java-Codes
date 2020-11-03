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
class Super
{
    String hello;
    public Super(String hello) { this.hello = hello; }
}
class Sub1 extends Super
{
    static String world = "world";
    //static String world = "world";
    public Sub1()
    {
        //super(world); // not allowed
        //super(getString()); // not allowed
        //super(getStaticString()); // allowed
        super(getStaticString());// only static method or variable use in argument
    }
    public String getString() { return "world"; } 
    private static String getStaticString() { return "world"; }
}
class Sub
{
    public static void main(String a[])
    {
        Sub1 ob = new Sub1();
        ob.getString();
    }
}
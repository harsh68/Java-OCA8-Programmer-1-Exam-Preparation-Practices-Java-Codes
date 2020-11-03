/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticpck;

/**
 * *,HW,cc,db,IB,cc,db
 *
 * @author Harsh
 */
class Delhi
{
    static  // static block
    {
        System.out.println("capital city");
    }
    { //instance initialization block
        System.out.println("Delhi block");
    }
}
class Arj
{
    static
    {
        System.out.println("arjun");
    }
}
public class Block {
    static{
        System.out.println("*");
    }
    {
        System.out.println("India Block");
    }
    public static void main(String[] args) {
        System.out.println("Hello world");
        new Delhi();
        new Arj();
        new Block();
        new Delhi();
    }
}

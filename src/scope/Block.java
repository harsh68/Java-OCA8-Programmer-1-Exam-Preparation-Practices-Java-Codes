/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scope;

/**
 *
 * @author Harsh
 */
class Delhi
{
     
    Delhi()
    {
        System.out.println("Default Constructor");
    }
    static  // static block
    {
        System.out.println("capital city");
    }
    { //instance initialization block
        System.out.println("Delhi block");
       // System.out.println(position);
        position = "new Hello";
    }
     String position = "Hello";
}
public class Block {
    Block()
    {
        System.out.println("Block Default Constructor");
    }
    static{
        System.out.print("*");
    }
    {
        System.out.println("India Block");
    }
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println(new Delhi().position);
        new Block();
        new Delhi();
    }
}


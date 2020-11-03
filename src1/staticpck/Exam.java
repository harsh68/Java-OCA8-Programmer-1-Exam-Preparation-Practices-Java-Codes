/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticpck;

/**
 *
 * @author Harsh
 */
class Dupper
{
    Dupper()
    {
        System.out.println("Constructor super");
    }
    static
    {
        System.out.println("static block super");
    }
    {
        System.out.println("Super class initializer block");
    }
}
     class InitializationOrderSimple extends Dupper
     {
        private String name = "Torchie";
        { System.out.println(name); }
        private static int COUNT = 0;
        static { System.out.println(COUNT); }
        static { COUNT += 10; System.out.println(COUNT); }
 
        public InitializationOrderSimple()
        {
            System.out.println("constructor");
        }
     }
public class Exam {
    public static void main(String[] args) {
        InitializationOrderSimple io = new InitializationOrderSimple(); 
    }
}

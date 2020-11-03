/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Super;

/**
 *
 * @author Harsh
 */
    class Animal2
    {  
        Animal2(){System.out.println("animal is created");} 
        Animal2(int a){System.out.println("value of a"+a);} 
    }  
    class Dog2 extends Animal2
    {  
        Dog2()
        {  
            int b = 10;
           // super();  
           //super(5);
            System.out.println("dog is created");
            System.out.println("Value of b is"+b);
        }  
    }  
    class TestSuper3
    {  
        public static void main(String args[])
        {  
            Dog2 d=new Dog2();  
        }
    }  
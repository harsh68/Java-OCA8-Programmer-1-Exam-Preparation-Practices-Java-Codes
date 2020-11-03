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
class Animal
{  
    String color="white";  
}  
class Dog extends Animal
{  
    String color="black";  
    void printColor()
    {  
        System.out.println(color);//prints color of Dog class  
        System.out.println(super.color);//prints color of Animal class  
    }  
}  
    class TestSuper
    {  
        public static void main(String args[])
        {  
            Dog d=new Dog();  
            d.printColor();  
        }
    }  

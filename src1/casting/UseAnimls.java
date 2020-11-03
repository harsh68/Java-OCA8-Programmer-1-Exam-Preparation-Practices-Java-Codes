/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casting;

/**
 *
 * @author Harsh
 */
class Animal 
{ 
    public void callme()
    {
        System.out.println("In callme of Animal");
    }
}


class Dog extends Animal 
{ 
    public void callme()
    {
        System.out.println("In callme of Dog");
    }

    public void callme2()
    {
        System.out.println("In callme2 of Dog");
    }
}

public class UseAnimls 
{
    public static void main (String [] args) 
    {
        Dog d = new Dog(); // dog is dog      
        Animal a = (Animal)d; //Animal is dog
        d.callme();
        a.callme();
        ((Dog) a).callme2();
    }
}
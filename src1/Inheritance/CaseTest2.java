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
class Ani3
{
    void noise()
    {
        System.out.println("noise");
    }
}
class Dog extends Ani3
{
    @Override
    void noise()
    {
        System.out.println("noise extend");
    }
    void playd()
    {
        System.out.println("sokh");
    }
}
public class CaseTest2 {
    public static void main(String a[])
    {
        Ani3[] a2 = {new Ani3() , new Dog(),new Ani3()};
        for(Ani3 ob :a2)
        {
            ob.noise();
            if(ob instanceof Dog)
            {
                Dog d = (Dog) ob;//
                d.playd();
            }
        }
    }
}

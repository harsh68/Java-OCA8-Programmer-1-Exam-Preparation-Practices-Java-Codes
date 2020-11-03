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
class Ind
{
    int a =44;
    void display()
    {
        System.out.println("display in ind");
    }
}
class Bha extends Ind
{
    int a =12;
    @Override 
    void display()
     {
         System.out.println("Override method");
     }
}
public class Ov {
    public static void main(String[] args) {
        Ind i = new Bha();
        i.display();
        System.out.println(i.a);
    }   
}
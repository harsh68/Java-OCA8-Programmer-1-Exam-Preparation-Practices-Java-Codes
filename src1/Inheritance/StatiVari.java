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
class Indu
{
    int a=45;
    void geta()
    {
        System.out.println("a:"+a);
    }
}
class Bihari extends Indu
{
    int a =34;
    void geta()
    {
        System.out.println("a:"+a);
    }
}
public class StatiVari {
    public static void main(String[] args) {
        Indu b = new Bihari();
        System.out.println("b: "+b.a);
        b.geta();
        
    }
}

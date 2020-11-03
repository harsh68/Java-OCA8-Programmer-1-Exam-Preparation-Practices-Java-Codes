/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Harsh
 */
class Abc
{
    int ans;
    void display()
    {
        final int ans;
        ans =30;
        System.out.println(ans);
    }
}
public class Testf {
    public static void main(String...a)
    {
        Abc ob = new Abc();
        ob.ans = 40;
        ob.display();
    }  
}

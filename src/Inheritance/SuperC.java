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
class Sup1
{
    int sup1()
    {
        System.out.println("in super class");
        return 1;
    }
}
public class SuperC extends Sup1{
    void sup1() //Override but same signature required  its not override or overload
    {
        System.out.println("in sub class");
        
    }
    public static void main(String[] args) {
        
    }
}

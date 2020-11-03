/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wrappers;

/**
 *
 * @author Harsh
 */
public class Arguments {
    public static void main(String[] args) {
        //For all wraper classes both constructor are valid except Character class
        Integer i1 = new Integer(42);
        Integer i2 = new Integer("42");
        
        System.out.println("Value of i1: "+i1);
        System.out.println("Value of i2: "+i2);
     
        Float y = 5.55f;
        Float x = y;
        
        if(x==y){
            System.out.println("True");
        }
        
        String s = "Hello"; //in pool memory
        String t = "Hello"; //in pool memory
        if(s==t)
        {
            System.out.println("Refer same Object");
        }
        String n1 = new String("Hellos"); //non pool memory
        String n2 = new String("Hellos"); //non pool memory
        
        if(n1==n2)
        {
            System.out.println("Have you checked?");
        }
        if(s instanceof Object)
        {
            System.out.println("Always");
        }
        
    }
}

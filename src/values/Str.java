/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package values;

/**
 *
 * @author Harsh
 */
public class Str
{
    int a;
 public static void main(String[] args) 
    { 
        Str ob = new Str();
        Str ob2 = new Str();
        
        System.out.println(ob==ob2);
        System.out.println(ob.equals(ob2));
        ob2=ob;
         System.out.println(ob==ob2);
        System.out.println(ob.equals(ob2));
        
        String s1 = new String("HELLO"); 
        String s2 = new String("HELLO"); 
        String s3[]=new String[5];
        System.out.println(s1 == s2);
        System.out.println("Hello"=="Hello");
        System.out.println(s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1);
    } 
} 

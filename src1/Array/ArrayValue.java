/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author Harsh
 */
public class ArrayValue {
    static int c[]; // array is object and its not explicitly initialize so default value is 0
    static String a[] = new String[100]; // explicit initialize 
    static int b[] = new int[100];
    
     int e[]; // array is object and its not explicitly initialize so default value is null
     int h;
     String[] i;
     static String[] j;
     String f[] = new String[100]; // explicit initialize 
     int g[] = new int[100];
   
     public static void main(String[] args) {
         ArrayValue av = new ArrayValue();
         System.out.println(a); //address
         System.out.println(b[4]);//0
         System.out.println("Value of c: "+c);//null
         System.out.println("value of h: "+av.h);//0
         System.out.println("value of String i"+av.i);//null
         System.out.println("value of String j"+j);//null
         av.display();
    }
    void display()
    {
         System.out.println("value of e: "+e); //null
         System.out.println(f[4]);//null
         System.out.println(g[4]);//0
         System.out.println("size of an array"+b.length);//100
         
    }
    
}

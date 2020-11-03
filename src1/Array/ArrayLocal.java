/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
  @author Harsh
 *  Since arrays are objects in Java,
 *  we can find their length using member length.
 *  This is different from C/C++ where we find length using sizeof.
 *
 */
public class ArrayLocal 
{
     String i[] = new String[100]; // Instance 
     double[] j;
     Character[] ch = new Character[2];
     char[] ch1;
     boolean[] t;
     public static void main(String[] args) {
       ArrayLocal al = new ArrayLocal();
         System.out.println("boolean array: "+al.t); 
       
       int h[];  //Local Variable
       
        int j[] = new int[100]; // Local
       //System.out.println(h);  // must initialize as local array object
        System.out.println(al.i);
        System.out.println(al.i[2]);
        System.out.println(al.i[2]);
        System.out.println(j[2]);
        System.out.println(al.j);
        System.out.println("Char :"+al.ch[0]);
        System.out.println("char :"+al.ch1);
        
        //System.out.println(j[101]);
       // System.out.println(i.length);
    }
}

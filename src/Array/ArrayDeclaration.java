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
public class ArrayDeclaration {
    public static void main(String[] args) {
        
        
        int[] a;
        //int[2] b; ilegal to give size during declaration- not compile
        int[] c[]; //legal but not right
        int [] d; //bad way
        int e []; //bad way
        //the JVM doesn’t allocate space until you actually instantiate the array object
        /*To create an array object, Java must know how much space to allocate on the
heap, so you must specify the size of the array at creation time. */        
        
        //int[] h = new int[]; // compilation Error
         int[]h = new int[]{};
         System.out.println(h.length);
         //System.out.println(c.length);         
        
        
        int[] test;
        test = new int[4];
        
        // create array of size 4 in heap memory with default value 0
    }
}

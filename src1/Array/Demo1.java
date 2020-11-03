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
public class Demo1 {
    public static void main(String[] args) {
        int[][] a = {{1,2},{1,2,3,4}};
        int[] b =  a[1];
        Object ob = a;
        int[][] a2 = (int[][])ob;
       //int[] b2 = (int[]) ob; //Runtime Exception 
       //int[] b5 = (int[]) a2; //compile time Exception 
        System.out.println("value at b[1]: "+b[1]);
    }
}

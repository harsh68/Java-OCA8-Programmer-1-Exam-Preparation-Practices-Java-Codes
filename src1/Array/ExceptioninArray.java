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

public class ExceptioninArray {
    public static void main(String[] args) {
        
        int[] a = new int[4];
        int b =-1;
        a[0] =1;
        a[2]=4;
        a[1]=10;
        System.out.println("Index -2 array element: "+a[-2]); //And its Runtime Exception ArrayOutofBound Exception
        
        int[] a1 = new int[]{4,2,1};
        //int[] a2 = new int[3]{4,2,1}; you dont need to assign size while declaring anonymous array
        
        //int[] b1 = new int[]{0,new ExceptioninArray(),12}; //having int value only
        
        
    }
}

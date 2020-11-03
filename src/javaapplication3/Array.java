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
public class Array {
    
    public static void main(String...a)
    {
        int[][] array2D = { {1,2,3}, {7,6,5,4}};
        System.out.println(array2D.length);//2
        System.out.println(array2D[0].length);//3
        System.out.println(array2D[1].length);//4
        System.out.println(array2D.getClass());
        System.out.println(array2D.getClass().isArray());
        System.out.println(array2D[0][1]);
        System.out.println(array2D[1].length);
        for(int i=0;i<4;i++);
        {
            System.out.println("Hello");
        }
    }
    
}

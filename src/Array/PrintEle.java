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

public class PrintEle {
    public static void main(String[] args) {
        int[][] a = {{1,2,3,4,5,6}};
        int i=0;
        for(int[] j:a) //must be local
        {
            System.out.println(" "+i);
        }
    }
    
}

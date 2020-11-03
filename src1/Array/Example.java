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
class Cat
{
    
}
public class Example {
    public static void main(String[] args) {
        
        Cat[][] twoD = new Cat[5][];
        Cat[] oneD = new Cat[4];
        int c =45;
       /* dimention must be same*/
        //twoD = oneD; 
        //oneD = twoD;
        
        int[][] see = new int[3][];
        int[] number = new int[4];
        //see[0] = 45; //Its should be int Array object not int value
        see[0] = new int[3]; // true
        see[1] = number;
        
    }
}

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
public class Arrayva {
    public static void main(String[] args) {
        int[][] ab = new int[3][];
        ab[0] = new int[2];
        ab[1] = new int[3];
        //System.out.println(ab[2][1]); //null pointer exception
        ab[0][0] = 45;
        System.out.println(ab[0][1]);
    }
}

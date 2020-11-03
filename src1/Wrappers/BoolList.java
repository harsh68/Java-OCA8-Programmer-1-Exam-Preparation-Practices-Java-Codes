/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wrappers;

/**
 *
 * @author Harsh
 */
public class BoolList {
    Boolean[] b = new Boolean[2];
    boolean[] b1 = new boolean[2];
    void dis()
    {
        System.out.println(b[0]);
        System.out.println(b1[0]);
    }
    public static void main(String[] args) {
        BoolList bl = new BoolList();
        bl.dis();
        Boolean[] b3 = new Boolean[3];
        System.out.println("b3:"+ b3[1]);
        boolean[] b4 = new boolean[2];
        System.out.println(b4[0]);
    }
}

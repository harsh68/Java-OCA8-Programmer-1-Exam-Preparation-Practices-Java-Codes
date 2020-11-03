/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringFun;

/**
 *
 * @author Harsh
 */
public class ObjectEquality {
    public static void main(String[] args) {
        
        ObjectEquality oe = new ObjectEquality();
        ObjectEquality oe1 = new ObjectEquality();
        ObjectEquality oe2 = oe;
        System.out.println(oe.equals(oe2)); // Class does not implement equals method
        String s = null;
        String s2 = null;
        System.out.println(s.equals(s2)); //Exception
    }
}

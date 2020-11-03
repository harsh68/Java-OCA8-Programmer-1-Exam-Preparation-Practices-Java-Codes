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
public class BoolVal {
    public static void main(String[] args) {
        Boolean b = new Boolean(null);
        System.out.println("b"+b);
          b=null;
        boolean b1 = b.booleanValue();
        System.out.println(b1);
    }
}

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
public class ChainMethod {
    public static void main(String[] args) {
        String s = "Hello";
        String new1 =  s.concat("World").toLowerCase().replace('h', '$');
        System.out.println("New1: "+new1);
    }
}

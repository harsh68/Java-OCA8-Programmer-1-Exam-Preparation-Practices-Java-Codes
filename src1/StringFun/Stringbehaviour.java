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
public class Stringbehaviour {
    public static void main(String[] args) {
        String s = "hello";
        String t = s;
        System.out.println(s==t);
        t.toUpperCase();
        System.out.println(t);
        System.out.println(s);
    }
}

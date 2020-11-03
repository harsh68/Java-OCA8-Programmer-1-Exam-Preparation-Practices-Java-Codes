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
public class AllStringMethod {
    public static void main(String[] args) {
        String s = "Hello Wello";
        System.out.println(s.length());
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(6));
    //    System.out.println(s.charAt(40)); //StringIndexOutOfBoundsException
        System.out.println(s.charAt(-50));  //StringIndexOutOfBoundsException
        
    }
}

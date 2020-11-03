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
public class StringCl {
    public static void main(String[] args) {
        String s = "Hello";
        String s1 = "Hello";
        String s2 = new String("Hello");
        if(s==s1){ System.out.println("first if");}
        if(s.equals(s1)){ System.out.println("second if");}
        if(s==s2){ System.out.println("third if");}
        if(s.equals(s2)){ System.out.println("fourth if");}
    }
}

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
public class Doit {
    public static void main(String[] args) {
        final String s = "harsh";
        String s1 = "Patel";
        String s3 = s+s1;
        String s4 = s + "Patel";
        String s5 = "harshPatel";
        String s6 = "harsh"+s1;
        String s7 = s+"Patel"+"";
        System.out.println(s4==s5);
        System.out.println(s5==s7);
        System.out.println(s7==s4);
        System.out.println(s3==s5);
        System.out.println(s4==s6);
        System.out.println(s3==s5);
        
        
    }
}

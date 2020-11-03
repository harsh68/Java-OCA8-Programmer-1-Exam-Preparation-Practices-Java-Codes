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
public class StrVl {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1==s2);
        String s3 = "Hello"+"";
        System.out.println(s1==s3);
        s3=s3+"";
        System.out.println(s1==s3);
        
    }
}

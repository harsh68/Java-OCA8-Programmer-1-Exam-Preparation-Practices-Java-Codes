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
public class IdenticalStringPresentInpool {
    public static void main(String[] args) {
        String s = "Hello";
        s = null;
        //Hello lost 
        String s1 = "Hello";
        String s2 = "hEllO";
        //Identical String found in pool memory("Hello")
        //s1 refer Hello which was created by s [Existing string has addistional reference]
       // char ch = s1.charAt(10);//StringArrayIndexOutOfBoundException
       //char ch1 = s1.charAt(-2);
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.concat("H"));
        System.out.println(s1);
        System.out.println(s1.replace('l', 'L'));
        System.out.println(s1.replaceAll("H", "**"));
        System.out.println(s1.subSequence(0, 2));
        System.out.println(s1.substring(2));//begin from index
        System.out.println(s1.substring(0, 2)); //first argument start with index 0 and second argument start with index 1
        String s3 = "   Jel  New   ";
        System.out.println(s3.trim());
        System.out.println(s3.toString());
        System.out.println(s3.trim().toUpperCase().charAt(1));
    }
}

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
public class StringS {
    public static void main(String[] args) {
        String s = "abc";
        //String s = new String("abc");
        boolean b = true;
        String s1 = s+b;
        System.out.println(s1);
        StringBuilder ss = new StringBuilder("Harsh");
        ss.append(true);
        System.out.println(ss);
        ss.insert(0,"Hello");
        System.out.println(ss);
        ss.insert(1, "NEW");
        System.out.println(ss);
    }
}

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
public class StrStb {
    public static void main(String[] args) {
        String s = "hello";
        StringBuilder sb = new StringBuilder("World");
        StringBuilder sb2 = new StringBuilder(sb);
        //StringBuilder sb2 = new StringBuilder(s);
        System.out.println(s+sb);
        System.out.println(sb+s);
        System.out.println(sb2);
        System.out.println(sb2.hashCode());
        System.out.println(sb.hashCode());
    }
}

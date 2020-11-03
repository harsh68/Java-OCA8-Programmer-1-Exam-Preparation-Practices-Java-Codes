/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringBuilder_codes;

/**
 *
 * @author Harsh
 */
public class StringBuil {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("hello");
        StringBuilder s1 = new StringBuilder("hello");
        if(s.equals(s1)){System.out.println("true1");}else{System.out.println("false1");}
         s=s1;
          if(s.equals(s1)){System.out.println("true2");}else{System.out.println("false2");}
          String s3 = "hello";
          System.out.println(s1.equals(s3));
    }
}

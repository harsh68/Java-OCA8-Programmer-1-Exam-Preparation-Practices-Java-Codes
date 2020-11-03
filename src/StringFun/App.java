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
public class App {
    public static void main(String[] args) {
        String s = "hello";
        String s1 = new String("Hello");
        if(s.equalsIgnoreCase(s1))
        {
            System.out.println("true");
        }
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb.equals(s));
        System.out.println(sb.equals(sb));
        String s5 =null;
      //  System.out.println(s5.concat("element"));
        System.out.println(s.concat("not null value"));
        //System.out.println(s.concat(null));
        System.out.println(s.concat("element"+null));
        //sb.append(null);
    }
}

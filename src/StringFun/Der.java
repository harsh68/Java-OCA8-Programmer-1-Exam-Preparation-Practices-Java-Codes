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
public class Der {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("123");
        String s = "123";
        System.out.println("string length: "+s.length() +" StringBuilder length: "+ sb.length());
        if(s.equals(sb.toString()))
        {
            System.out.println("matchh");
        }
        
        if(s.equals(sb))
        {
            System.out.println("matchh2");
        }
    }
}

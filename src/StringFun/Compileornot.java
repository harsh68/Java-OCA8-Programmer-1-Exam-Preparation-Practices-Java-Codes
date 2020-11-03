/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringFun;

import java.util.ArrayList;

/**
 *
 * @author Harsh
 */
public class Compileornot {
    public static void main(String[] args) {
        String s ="hello";
        StringBuilder sb = new StringBuilder("hello");
     //   if(s==sb)
        {
            
        }
        if(s.equals(sb))
        {
            System.out.println("never ex");
        }
         if(s.equals(sb.toString()))
        {
            System.out.println(" ex");
        }
         
         ArrayList al = new ArrayList();
         
    }
}

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
public class RefeStr {
    public static void main(String[] args)
    {
         /*
        //String
        .equals two compare string value s
        optional for string two check equality using == (pool memory)
        
        //StringBuilder
        == compare reference and .equals also compare reference
        
        */
        
        StringBuilder s1 = new StringBuilder("Hello");
        StringBuilder s2 = new StringBuilder("Hello");
        System.out.println(s1.equals(s2)); //false
        System.out.println(s1==s2);  //false
    }
   
}

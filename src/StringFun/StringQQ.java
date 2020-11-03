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
public class StringQQ {
    public static void main(String[] args) {
        String s = "123456789";
        System.out.println(s.substring(s.indexOf("7"),s.indexOf("9")));
        System.out.println(s.substring(s.indexOf("7"),s.indexOf("9")).concat("0"));
        System.out.println(s.substring(s.indexOf("9"),s.indexOf("7")));
        
    }
    
}

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
public class StringH {
    public static void main(String[] args) {
        String s = "I Love my IndiaLo";
        s=s.replace('L', '*');
        System.out.println(s);
        s=s.replaceAll("I", "Lo");
        System.out.println(s);
        StringBuilder sb = new StringBuilder("West is best");
        //only one replace method in SB 
       
    }
}

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
public class Stringhh {
    public static void main(String[] args) {
        String s = new String("Java");
        String s1 = "java";
        if(s.equalsIgnoreCase(s1))
        {
            System.out.println("true");
        }
        
        String s3 = s;
        if(s3==s)
        {
            System.out.println("second true");
        }
    }
}

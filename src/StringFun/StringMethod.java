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
public class StringMethod {
    public static void main(String[] args) {
        String s = new String("Hello World");
        char result = s.charAt(2);
        System.out.println(" character in string position 2:"+ result);
        for(int i=s.length()-1;i>=0;i--)
        {
            System.out.print(s.charAt(i));
        }
        
        char[] arraych = {'A','E','I','O','U'};
        String constructfromchararray = new String(arraych);
        System.out.println("arraych: "+constructfromchararray);
                
    }
}

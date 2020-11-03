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
public class Book {
    public static void main(String[] args) {
        String [] bugs = { "cricket", "beetle", "ladybug" };
        String [] alias = bugs;
        System.out.println(bugs.equals(alias)); // true
        System.out.println("==: "+ (bugs==alias)); //true
        int[] a = {12,13,14};
        int[] b = a;
        System.out.println("a.equals(b)"+a.equals(b));
        System.out.println("a==b: "+(a==b));
        
        Float f = Float.valueOf("2.2f");
        Float f1 = Float.valueOf(2.2f);
        System.out.println(f);
        Double d = Double.valueOf("2.2");
        Double d1 = Double.valueOf(2.2f);
        Double d2 = Double.valueOf(2);
        Double d3 = Double.valueOf(2.2);
        
        
    }
}

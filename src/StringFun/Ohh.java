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
public class Ohh {
    public static void main(String[] args) {
        String x = "Hello World";  //its String literal
        String z = " Hello World".trim(); //not in pool
        System.out.println(x == z); // false even have same value
        System.out.println(x.equals(z)); // true
        
        String x1 = new String("Hello World");
        String y1 = "Hello World"; //this is in pool memory and it cant shared
        System.out.println(x1 == y1); // false
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumberSystem;

/**
 *
 * @author Harsh
 */
public class IsitForm {
    public static void main(String[] args) {
        
        int a= 12_34;
        System.out.println(a);
        int j = Integer.parseInt("45"); //compile time error
        double d = Integer.parseInt("123.23");
        System.out.println(d);
         int i = Integer.parseInt("12_34"); //exception
        System.out.println(i);
        int date1 = Integer.parseInt("_2014_01_11"); //compile but exception
        System.out.println(date1);
        
    }
}

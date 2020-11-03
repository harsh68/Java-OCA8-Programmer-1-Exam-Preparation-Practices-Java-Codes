/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception_details;

/**
 *
 * @author Harsh
 */
public class Excce {
    static void cal(int[] a)
    {
        try
        {
            System.out.println(a[1] / (a[1]-a[2])); 
        }
        catch(ArithmeticException e)
        {
            System.out.println("AE");
        }
        System.out.println("er");
    }
    
    public static void main(String[] args) {
        try
        {
         int[] ar = {100,100};
         cal(ar);
        }
        catch(IllegalArgumentException w)
        {
            System.out.println("IA");
        }
        catch(java.lang.Exception e)
        {
            System.out.println("de");
        }
    }
}

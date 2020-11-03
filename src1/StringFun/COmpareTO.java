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
class Ert
{
    static Integer i;
}
public class COmpareTO {
    public static void main(String[] args) {
        String s1 = "cow";
        String s2 = " ";
        String s3 = "Goat";
        String s4 = "cow";
        System.out.println(s1.compareTo(s4)); //returns 0 if match
        System.out.println(s1.compareTo(s2)); //non zero return if not match
        try
        {
            
            System.out.println(Ert.i.compareTo(0));
        }
        catch(ArithmeticException | NullPointerException e )
        {
            System.out.println("caught");
        }
    }
}

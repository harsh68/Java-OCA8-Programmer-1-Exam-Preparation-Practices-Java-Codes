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
public class StringClassAddress {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 =new String("Hello");
        System.out.println("s1 :"+s1);
        System.out.println("s2 :"+s2);
        if(s1==s2)
        {
            System.out.println("both s1 & s2 points same object");
        }
        if(s1.equals(s2))
        {
            System.out.println("Both reference variable has same value");
        }
    }
}

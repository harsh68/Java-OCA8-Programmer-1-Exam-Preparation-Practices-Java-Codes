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
public class Operation {
    public static void main(String[] args) {
        int a=3,b=5,c,d;
        String s1 = "Hello";
        System.out.println(a+b+s1); //expression evaluate from left to right if parenthsis () then order will change 
        System.out.println(s1+a+b);
        System.out.println(s1+(a+b));
        boolean b1 = false;
        
        s1 = (b1=true)? "Result":"fail";
        System.out.println(s1);
        
        //if(5 & 6) even bitwise operator works with operand same for &&
        if(5==7)
            System.out.println("Not equal");
        {
            
        }
        System.out.println(true & false == false | true);
        System.out.println((true & false)==(false|true));
    }
}

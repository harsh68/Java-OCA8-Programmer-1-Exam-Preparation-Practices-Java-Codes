/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package values;

/**
 *
 * @author Harsh
 */
public class Error {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        String s = "Hello";
        //if(s==sb){} // you can not compare == String and StringBuilder
        if(sb.equals(s))
        {
            System.out.println("P");
        }
        int n;
        n=10;
        String s1 = n+"";
        //String s2 = n+1;
        String s3 = "Hello";
        if(s3=="Hello"){System.out.println("*");}
        if(s3==s){System.out.println("**");}
        
    }
}

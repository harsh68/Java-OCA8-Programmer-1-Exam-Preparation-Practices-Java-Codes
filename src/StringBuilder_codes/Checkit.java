/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringBuilder_codes;

/**
 *
 * @author Harsh
 */
public class Checkit {
    public static void main(String[] args) {
        
    
    StringBuilder sb = new StringBuilder();
    String s = null;
    String s2 = null;
        System.out.println("sb"+sb.length());
    if(sb.equals(s))
    {
        System.out.println("no");       
    }
    else
    {
        System.out.println("Yes");
    }
       
    if(null==null)
    {
        System.out.println("d");
    }
    if(s==s2)
    {
        System.out.println("null==null");
    }
    if(s.equals(s2))
    {
        System.out.println("DD");
    }
    if(s.equals(null))
    {
        System.out.println("dd");
    }
}
}

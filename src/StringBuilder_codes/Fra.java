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
public class Fra {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(5);
        String s = "";
        
        if(sb.equals(s))
        {
            System.out.println("match1");
        }
        else if(sb.toString().equals(s.toString()))
        {
            System.out.println("match2");
        }
        else
        {
            System.out.println("no match");
        }
    }
}

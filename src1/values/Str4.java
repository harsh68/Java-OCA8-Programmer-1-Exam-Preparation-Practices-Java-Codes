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
public class Str4 {
    public static void main(String ar[])
    {
        StringBuilder sb = new StringBuilder("123");
        System.out.println(sb.append("abc"));
        String s = "new";
        System.out.println(s.concat("India")); // concate create new String Object append not.
        System.out.println(sb);
        System.out.println(s);
    }
    
}

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
public class StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String s ="SH";
        sb.append("hello");
        sb.append(2.33f);
        System.out.println(sb);    
        sb.append(true);
        sb.append(sb);
        System.out.println(sb);
        sb.append(new char[]{'H','A','R'});
        System.out.println(sb);
        sb.append(s);
        CharSequence seq = "newPATEL";
        sb.append(seq,3,200);
        System.out.println(sb);
        char[] ch1 = {'I','N','D','I','A'};
        sb.append(ch1,0,2);
        System.out.println(sb);
        
        
        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b = b.append("f").append("g");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println(sb.length());
        //sb = null;
        //System.out.println(sb.length());
        sb.append("newvalue");
        System.out.println(sb);
       StringBuilder sb1 = new StringBuilder("animals");
String sub = sb1.substring(sb1.indexOf("a"), sb1.indexOf("al"));
int len = sb1.length();
        System.out.println(sb1);
char ch = sb1.charAt(7);
StringBuilder sb2 = new StringBuilder("abcdef");
sb2.delete(1, 3); // sb = adef
sb2.deleteCharAt(5); // throws an exception

        
        
        
    }
}

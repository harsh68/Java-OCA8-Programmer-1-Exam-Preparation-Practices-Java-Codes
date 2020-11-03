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
public class Wonder {
    public static void main(String[] args) {
        String s = "hello";
        String s2= "hello";
        if(s==s2){System.out.println("true");}
        String s3 ="llo";
        String s4 = "he";
        String s5 = s3+s4;
        if(s5==s){System.out.println("is print?");}
        String s6 = "";
        s6=s6.concat(s);
        if(s6==s){System.out.println("really print?");}
        String st = "value of java exam";
        System.out.println(st.substring(3, 5));
        System.out.println(st.startsWith("a", 1));
        
    }
}

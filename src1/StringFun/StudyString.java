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
public class StudyString {
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "java";
        if(s1==s2)System.out.println("print1");
        if(s1.equals(s2))System.out.println("print2");
        StringBuffer sb = new StringBuffer();
        sb.append("ja").append("va");
        if(sb.toString()==s1)System.out.println("print3");
        if(sb.toString().equals(s1))System.out.println("print4");
         }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Output;

/**
 *
 * @author Harsh
 */
public class Stringoutput {
    public static void main(String[] args)
    {
        String s1 = "Java";
String s2 = "Java";
StringBuilder sb1 = new StringBuilder();
String s3 = new String("Java");
String s4 =new String("Java");
sb1.append("Ja").append("va");
//System.out.println(sb1);
System.out.println(s1 == s2);//true
System.out.println(s3 == s4);//false
s3=s4;
System.out.println(s3 == s4);//true
System.out.println(s1.equals(s2));//true
System.out.println(sb1.toString() == s1);//false
System.out.println(sb1.toString().equals(s1));//true
    }
}

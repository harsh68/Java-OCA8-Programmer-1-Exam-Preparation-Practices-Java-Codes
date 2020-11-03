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
class Test1 { 
   int i = 10; 
} 
public class Test2 { 
    public static void main(String args[])
 { 
         final Test1 t1 = new Test1();
         t1.i = 30;  // Works
         t1.i =45;  // Works
        System.out.println(t1.i);
        // t1 = new Test1();
        String s1 = "abc";
        System.out.println(s1.concat("123"));
        System.out.println(s1);
        
        StringBuilder sb1 = new StringBuilder("123"); 
        sb1.append("PQR");
        System.out.println(sb1);
        
        //append is method of Stringbuilder class and concate is method of String class
    } 
}


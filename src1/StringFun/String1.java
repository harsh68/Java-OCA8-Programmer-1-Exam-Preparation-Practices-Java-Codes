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
public class String1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s[] = new String[10];
        System.out.println(s.length);
        // length is final variable to find length of ana array
        String s1[]={"Harsh","P","Patel"};
        System.out.println(s1.length);
        System.out.println(s1[0].length());
        // length use with array size
        //length() use with String to find string lenth
        // TODO code application logic here
        String nw = "Hello Wello";
        System.out.println(nw.indexOf("ll", 5));
        System.out.println(nw.indexOf("ll", 23));
        
        StringBuilder sb = new StringBuilder("Hellos");
        sb.substring(4);
        System.out.println(sb);
       
       // System.out.println(sb.substring(3, 2));
        
        System.out.println("Abc$".equals("Abc$"));
        System.out.println("AbcD$".equalsIgnoreCase("Abcd$"));
        System.out.println("Hello Wello".replace("ll", "**"));
        System.out.println("Abc".equals("Abc ".trim()));
        
        StringBuilder sv = new StringBuilder("Hello");
        //StringBuilder sv1 = sv.substring(3); //substring() returns String
        
        String x = "Hello World";
        String z = " Hello World".trim();
        System.out.println(x == z); // false becausle z is calculated at runtime
        System.out.println(x.equals(z)); //true
        
        String1 t1 = new String1();
        String1 t2 = new String1();
        String1 t3 = t1;
        System.out.println(t1 == t1); // true
        System.out.println(t1 == t2); // false
        System.out.println(t1.equals(t2)); // false
        System.out.println(t1.equals(t3));//true
    }
    
}

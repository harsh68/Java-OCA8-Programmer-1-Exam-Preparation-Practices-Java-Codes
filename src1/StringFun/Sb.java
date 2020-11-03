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
public class Sb {
    public static void main(String[] args) {
        String s = new String("Harsh");
        String s2 = new String("Harsh");
        String s3 = "Harsh";
        System.out.println(s);
        StringBuilder sb = new StringBuilder("Harsh");
        System.out.println(sb);
        StringBuffer sbf = new StringBuffer("Harsh");
        System.out.println(sbf);
        if(s.equals(s3)){System.out.println("Hi");}
        String s4 = s3;
        s4 = "Patel";
        System.out.println(s3+"  "+s4);
        StringBuilder sb1 = sb;
       // sb1 = "New India";
  
        if(s.equals(sb))
        {
            System.out.println("com");
        }
         if(s.equals(sbf))
        {
            System.out.println("com1");
        }
          if(sb.equals(sbf))
        {
            System.out.println("com2");
        }
           if(sbf.equals(sbf))
        {
            System.out.println("com3");
        }
             if(sb.equals(sb))
        {
            System.out.println("com*");
        }
           if(s==s2)
        {
            System.out.println("com4");
        }
           if(s=="Harsh")
        {
            System.out.println("com5");
        }
           if(s.equals("Harsh"))
        {
            System.out.println("com6");
        }
        if(s.equals(s2))
        {
            System.out.println("com7");
        }
    }
    
}

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
public class StrEx {
    public static void main(String[] args) {
         String a = "";
          a += 2;
          a += 'c';
          a += false;
          if (a == "2cfalse") System.out.println("==");
          if (a.equals("2cfalse")) System.out.println("equals");
          
          String s3 = "Hello";
          String s = "Hello";
          String s4 = "";
          String s5 = "He";
          s5 = s5+"llo";
          s4 +='H';
          s4 +="ello";
          
          //"Hello" is already in pool but some objects are made of String operation
          if(s3=="Hello"){System.out.println("*");}
          if(s4=="Hello"){System.out.println("**p**");} //both in pool
          if(s5=="Hello"){System.out.println("**$**");}//s5 not in pool 
          if(s3==s){System.out.println("*In*");}
          if(s3==s5){System.out.println("In pool?--No");} //s5 is not in pool
          if(s3==s4){System.out.println("In pool??--No");} // s4 not in pool
          }
          
    
}

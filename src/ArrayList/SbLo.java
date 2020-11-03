/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

/**
 *
 * @author Harsh
 */
public class SbLo {
    public static void main(String[] args) {
    //    StringBuilder sb = new StringBuilder();
       // sb = "ht";
    StringBuilder sb1 = new StringBuilder("animals");
    String sub = sb1.substring(sb1.indexOf("a"), sb1.indexOf("al"));
    
   //sb=null;
   //sb1.insert(400,'f');

   StringBuilder sb = new StringBuilder("abcdef");
   // System.out.println(sb.delete(1, 500)); 
   //sb.delete(1, -500); 
//bcdef

System.out.println(sb.deleteCharAt(5)); 
sb.deleteCharAt(0); 
        System.out.println(sb);

   
   
    }
}

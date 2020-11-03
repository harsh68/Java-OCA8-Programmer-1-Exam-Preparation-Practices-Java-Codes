/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumberSystem;

/**
 *
 * @author Harsh
 */
public class Num12 {
 public static void main(String[] args) {
         extractInt(2.7);
         extractInt(2);
     }
 
     private static void extractInt(Double obj) {
         System.out.println(obj.intValue());
     }
}




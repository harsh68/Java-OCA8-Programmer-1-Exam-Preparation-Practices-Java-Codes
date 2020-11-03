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
public class TestSwitch {
     public static void main(String[] args) {
         /*INSERT*/
         Character var = 7;
         char ch =7;
         //Integer i =7;
         //byte b=7;
         
         //Short s =7
         switch(ch) {
             case 7:
                 System.out.println("Lucky no. 7"+var);
                 break;
             default:
                 System.out.println("DEFAULT");
         }
     }
}
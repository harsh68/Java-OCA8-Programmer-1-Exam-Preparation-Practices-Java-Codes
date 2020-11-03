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
public class Switch1 {
    
public static void main(String[] args) {
    char var = 65535;
         switch(var) {
             case 100:
                 System.out.println("var is 100");
                 break;
             case 65535:
                 System.out.println("var is 200");
                 break;
             default:
                 System.out.println("In default");
         }  
    }
   
}


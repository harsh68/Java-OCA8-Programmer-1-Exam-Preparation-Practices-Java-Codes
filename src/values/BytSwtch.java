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
//byte or Byte -128 to 127
//short or Short -32,768 to 32,767
//char or Character 0 to 65,536
public class BytSwtch {
    public static void main(String[] args) {
    Byte var = 100;
         switch(var) {
             case 100:
                 System.out.println("var is 100");
                 break;
             case -129:
                 System.out.println("var is 200");
                 break;
             default:
                 System.out.println("In default");
         }  
    }
   
}

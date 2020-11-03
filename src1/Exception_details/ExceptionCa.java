/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception_details;

import java.io.IOException;

/**
 *
 * @author Harsh
 */
public class ExceptionCa {
     private static void m1() throws IOException {
         throw new IOException();
     }
 
     public static void main(String[] args) throws IOException{
         try {
            
             m1(); //either catch or throws with method declare with checked exception
         }
      
         finally {
             System.out.println("A");
         }
     }
}

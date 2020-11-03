/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package values;

import java.io.FileNotFoundException;

/**
 *
 * @author Harsh
 */
public class OutPrint {
    public static void main(String[] args) {
         try {
             System.out.println(1);
         } catch (NullPointerException ex) {
             System.out.println("ONE");
         } catch (FileNotFoundException ex) {
             System.out.println("TWO");
         }
         System.out.println("THREE");
         while(false)
         {
             System.out.println("rrf");
         }
     }
}

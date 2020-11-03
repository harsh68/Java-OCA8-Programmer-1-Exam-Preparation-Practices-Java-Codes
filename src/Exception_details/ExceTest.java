/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception_details;

/**
 *
 * @author Harsh
 */

import java.io.FileNotFoundException;
import java.io.IOException;
 
abstract class Super {
     public abstract void m1() throws IOException;
}
 
class Sub extends Super {
     @Override
     public void m1() throws IOException {
         throw new FileNotFoundException();
     }
}
 
public class ExceTest {
     public static void main(String[] args) {
         Super s = new Sub();
         try {
             s.m1();
         }
         catch (FileNotFoundException e) {
             System.out.print("M");
         } finally {
             System.out.print("N");
         }
     }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Output;

/**
 *
 * @author Harsh
 */

     interface HasTail { int getTailLength(); }
  class Puma implements HasTail 
 {
   
  @Override
   public int getTailLength() {return 4;}
 }
 public class Cougar extends Puma 
 {
   public static void main(String[] args)
   {
     HasTail puma = new Puma();
     System.out.println(puma.getTailLength());
   }
 public int getTailLength(int length) {return 2;}
}

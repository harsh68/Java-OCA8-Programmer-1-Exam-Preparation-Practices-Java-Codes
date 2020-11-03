/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author Harsh
 */

public class BoolVale {
    Boolean [] bh = new Boolean[2];
    boolean[] bj = new boolean[2];
    
    void methdis()
    {
        System.out.println(bh[0]+" "+bh[1]);
        System.out.println(bj[0]+" "+bj[1]);
    }
  public static void main(String[] args) {
         Boolean [] arr = new Boolean[2];
         boolean[] bj = new boolean[2];
         System.out.println(arr[0] + ":" + arr[1]);
          System.out.println(bj[0]+" "+bj[1]);
         BoolVale bv = new BoolVale();
         bv.methdis();
     }
}

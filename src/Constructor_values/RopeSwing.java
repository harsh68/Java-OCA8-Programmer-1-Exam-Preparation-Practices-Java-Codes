/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor_values;

import rope.Rope;
import static rope.Rope.*;
/**
 *
 * @author Harsh
 */
public class RopeSwing {
     //Rope rope1 = new Rope();
    private static  Rope rope1 = new Rope();
     private static  Rope rope2 = new Rope();
     {
        // System.out.println(rope1.length);
     }
     public static void main(String[] args) {
        rope1.length = 2;
        rope1.length = 8;
         System.out.println(rope1.length);
    }
}

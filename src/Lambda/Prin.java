/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lambda;

import java.util.function.Predicate;

/**
 *
 * @author Harsh
 */
public class Prin {
     public static void main(String[] args) {
  // INSERT CODE HERE
         System.out.println(test((Integer i) -> i == 5));
   }
    private static boolean test(Predicate<Integer> p) {
    return p.test(5);
    }
}

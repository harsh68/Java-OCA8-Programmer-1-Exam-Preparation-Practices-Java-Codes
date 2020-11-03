/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateTimeAPI;

import java.time.LocalDate;

/**
 *
 * @author Harsh
 */
public class DifferentInstance {   
 public static void main(String [] args) {
         LocalDate d1 = LocalDate.parse("1999-09-09");
         LocalDate d2 = LocalDate.parse("1999-09-09");
         LocalDate d3 = LocalDate.of(1999, 9, 9);
         LocalDate d4 = LocalDate.of(1999, 9, 9);
         LocalDate d5 = d2;
         System.out.println((d1 == d2) + ":" + (d2 == d3) + ":" + (d3 == d4) +":"+(d5==d2));
     }
}

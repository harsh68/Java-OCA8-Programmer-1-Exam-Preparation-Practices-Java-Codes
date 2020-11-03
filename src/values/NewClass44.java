/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package values;

import java.time.LocalDate;

/**
 *
 * @author Harsh
 */
public class NewClass44 {
    public static void main(String[] args) {
        LocalDate ld2 = LocalDate.of(2012, 01, 31);
        System.out.println(ld2);
        ld2.plusDays(10);//factory class Immutable object
        System.out.println(ld2);
        ld2=ld2.plusDays(10);
        System.out.println(ld2);
        
        LocalDate ld3 = LocalDate.of(2014, 02, 31); //java.time.DateTimeException: Invalid date
        LocalDate ld4 = LocalDate.of(2015, 01, 32);
    }
}

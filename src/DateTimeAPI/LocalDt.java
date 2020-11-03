/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateTimeAPI;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 *
 * @author Harsh
 */
public class LocalDt {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2020,02,03);
        System.out.println(ld.minusYears(-2));
        System.out.println(ld.plusYears(-5));
        Period p = Period.ofYears(-4);
        System.out.println(ld.plus(p));
        LocalDate of =LocalDate.of(2000, Month.DECEMBER, 31);
        System.out.println(of.minusYears(3000));
        System.out.println(of.minusYears(-3000));
        //System.out.println(of.minusYears(3000.34));
    }
}

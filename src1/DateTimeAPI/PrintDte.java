/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Harsh
 */
public class PrintDte {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2017, Month.MARCH, 3);
        LocalDate date2 = date1.plusDays(2).minusDays(10).minusDays(1);
        System.out.println(date2);
        LocalDate date3 = LocalDate.of(2017, Month.MARCH, 3);
        if(date1==date3) {System.out.println("same reference");}
        LocalDateTime pi = LocalDateTime.of(2017, 4, 14, 1, 59);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("Mhh.ddhhmm MMM yy mm h MMMMM y Y m ");
        System.out.println(pi.format(formatter));
    }
}

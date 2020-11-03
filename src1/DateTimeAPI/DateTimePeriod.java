/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateTimeAPI;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

/**
 *
 * @author Harsh
 */
public class DateTimePeriod {
    public static void main(String[] args) {
         Period period = Period.of(1, 0, 1);
         LocalDate n = LocalDate.now();
         n = n.plus(period);
         System.out.println(n);
         System.out.println(period);
         
         LocalTime lt = LocalTime.now();
         lt=lt.plus(period);
         System.out.println(lt);
    }
}

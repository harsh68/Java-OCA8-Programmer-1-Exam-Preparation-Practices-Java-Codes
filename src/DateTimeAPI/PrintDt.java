/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateTimeAPI;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Harsh
 */
public class PrintDt {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(1,2,3,999999999);
System.out.println(time);
LocalDate date1 = LocalDate.of(2017, Month.MARCH, 3);
LocalDate date2 = LocalDate.of(2017, Month.FEBRUARY, 31); //RuntimeException
System.out.println(date1.equals(date2));

LocalDate polarBearDay = LocalDate.of(2017, 2, 27);
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("Holiday: yyyy dd MMM"); //RuntimeException
System.out.println(polarBearDay.format(formatter));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Harsh
 */
public class VerifyDt {
    public static void main(String[] args) {
LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
LocalTime time = LocalTime.of(11, 12, 34);
LocalDateTime dateTime = LocalDateTime.of(date, time);

 System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
 System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
 System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
 System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE));
 System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_TIME));
               
    }
  
}

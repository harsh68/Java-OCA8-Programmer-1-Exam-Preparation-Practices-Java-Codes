/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateTimeAPI;

/**
 *
 * @author Harsh
 */
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ValueS {
   public static void main(String[] args) {

      LocalDate date = LocalDate.parse("2017-02-03");
      System.out.println(date);  
      LocalTime time = LocalTime.parse("10:30:20");
      LocalDateTime date1 = date.atTime(time);
      LocalDateTime ldd = date.atTime(12, 12);
      LocalTime lmh = LocalTime.MAX;
      System.out.println(date.atTime(lmh));  
   }
}

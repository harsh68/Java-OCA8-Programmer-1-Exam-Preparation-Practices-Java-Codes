/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package values;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Harsh
 */
public class Ld {
    public static void main(String[] args) {
        String date = LocalDate.parse("2018-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("Date: "+ date);
        //String datetime = LocalTime.parse("2018-05-04").format(DateTimeFormatter.ISO_TIME);
        //System.out.println("datetime: "+ datetime);
        //String date2 = LocalDateTime.parse("2018-05-04").format(DateTimeFormatter.ISO_DATE);
        //System.out.println("Date2: "+ date2);
        //String datetime3 = LocalDateTime.parse("2018-05-04").format(DateTimeFormatter.ISO_TIME);
        //System.out.println("datetime3: "+ datetime3);
        //String datetime4 = LocalDateTime.parse("2018-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
        //System.out.println("datetime4: "+ datetime4);
        //LocalDate.parse ---> ISO_DATE
         //LocalTime.parse ---> ISO_TIME
         //LocalDateTime.parse ---> ISO_DATE_TIME
         //LocalDateTime.parse ---> ISO_DATE
         //LocalDateTime.parse ---> ISO_TIME
         
    }
}

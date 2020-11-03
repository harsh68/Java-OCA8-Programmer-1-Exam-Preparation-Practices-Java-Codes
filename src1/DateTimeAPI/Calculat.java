/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Harsh
 */
public class Calculat {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_TIME;
        String timeStr = LocalTime.of(12, 5).format(dtf); //lt->format of df-->lt 
String dateStr = LocalDate.of(2016, 4, 1).format(dtf);//ld-->     df->ld
String dateTimeStr = LocalDateTime.of(2016, 4, 1, 12, 5).format(dtf);//ldt-->  df-> lt,ld,ldt
    }
}

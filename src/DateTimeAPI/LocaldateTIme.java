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

/**
 *
 * @author Harsh
 */
public class LocaldateTIme {
    public static void main(String[] args) {
        
        //immutable factory class LocalDateTime
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("Now: "+ldt); //YYYY-MM-DDTHH:MM:SS.SSS
        
        LocalTime lt = LocalTime.now();
        LocalDate ld = LocalDate.now();
        LocalDateTime ldt1 = LocalDateTime.of(ld, lt);
        
        
        LocalDateTime ldt2 = LocalDateTime.of(2020, 1, 2, 10, 43); //year,month,day,hour,minute,[second]
        LocalDateTime ldt3 = LocalDateTime.of(2020, Month.JANUARY, 2, 10, 43, 55);
        
        //LocalDateTime all classes are immutable
        
        
        
    }
}

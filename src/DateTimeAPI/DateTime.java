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
public class DateTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String ld = LocalDate.parse("2017-11-10").format(DateTimeFormatter.ISO_DATE);
        System.out.println(ld);
        
        LocalTime Time = LocalTime.now();
        System.out.println(Time);
         //System.out.println(Time.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        LocalDate dt = LocalDate.now();
        LocalDateTime ldt  = LocalDateTime.of(dt,Time);

    }
    
}



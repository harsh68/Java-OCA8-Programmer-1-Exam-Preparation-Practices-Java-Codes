/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Harsh
 */
public class ParseMethod {
    public static void main(String[] args) {
        //String to LocalDate
        LocalDate date = LocalDate.parse("2018-09-16");
        System.out.println("Date: "+date);
        
        
        //String to LocalDateTIme
        LocalDateTime localDateTime = LocalDateTime.parse("2018-09-16T08:00:00");
        System.out.println("localdate time: "+localDateTime);
         
        
        //String to Local
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
         LocalDateTime dateTime = LocalDateTime.from(f.parse("2012-01-10 23:13:26"));
    }
}

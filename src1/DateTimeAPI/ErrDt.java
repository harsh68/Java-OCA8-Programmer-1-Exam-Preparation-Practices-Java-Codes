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
public class ErrDt {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        LocalDateTime ldt = LocalDateTime.now();
        LocalTime lt = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        DateTimeFormatter fm = DateTimeFormatter.ISO_LOCAL_DATE;
        DateTimeFormatter fmdt = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        DateTimeFormatter fmt = DateTimeFormatter.ISO_LOCAL_TIME;
        System.out.println(ldt.format(formatter)); 
        
    }
}

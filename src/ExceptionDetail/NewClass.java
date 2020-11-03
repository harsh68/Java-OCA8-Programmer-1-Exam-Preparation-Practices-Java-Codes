/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionDetail;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

/**
 *
 * @author Harsh
 */
public class NewClass {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        ld = ld.minusSeconds(1);
        System.out.println(ld);
        Period period = Period.ofMonths(1);
        period = Period.ofWeeks(1);
        period = Period.ofMonths(32);
       
    }
}

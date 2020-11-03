/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package values;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Harsh
 */
public class ImportantClasses {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMddyyyy");
        LocalDate ld = null;
        
        try
        {
            ld = LocalDate.parse(args[0], df);
            
        }
        catch(DateTimeException dte)
        {
            System.out.println("Invalid Date");
            System.exit(0);
        }
        
        //of Current Year
        System.out.println("Your Birthday is on"+ ld);
        System.out.println("Day of Week: "+ ld.getDayOfWeek());
        System.out.println("Day of Month: "+ ld.getDayOfMonth());
        System.out.println("Day of Year :"+ld.getDayOfYear());
        
        //From the date (Period)
        Period p = Period.between(ld, LocalDate.now());
        System.out.println("You lived for num of days :"+p.getDays());
        System.out.println("You lived for num of Months :"+p.getMonths());
        System.out.println("You lived for num of Years :"+p.getYears());
        long days = ld.until(LocalDate.now(), ChronoUnit.DAYS);
        System.out.println("You lived for "+days+" till now");
        System.out.println("You will reach after 50,000 days :"+ld.plusDays(50_000));
        
        LocalDate d2017 = LocalDate.of(2_000, Month.MARCH, 01);
        Period pd  = Period.between(d2017, LocalDate.now());
        System.out.println("Period since 2017 "+ pd);
        
    }
}

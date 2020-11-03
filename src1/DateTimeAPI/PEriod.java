/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Harsh
 */
public class PEriod {
    public static void main(String[] args) {
        
        //Period class is use for if you want to represent Period of time "
        //one month,two year,two days" we use period
        
        //Use Number of Months/Days/Years
        
        Period pd = Period.ofMonths(2);
        
         //LocalDate ld = LocalDate.of(2020, 13, 2); //DateTime Exception
         // LocalDate ld = LocalDate.of(2020, 12, 32); //DateTime Exception
         
         //Immutability 
         
         LocalDate ld = LocalDate.of(2020, Month.JANUARY,2);
         ld.plus(pd);
         System.out.println("Original Date is: "+ld);
         System.out.println("After add 2 months ;)))"+ld);
         
         
         //Add the Period in Date
         LocalDate ld2 = ld.plus(pd);
         System.out.println("Now check Date after adding one month: "+ld2);
         
         
         //for adding span of period in date object
         pd = Period.ofWeeks(2);
         System.out.println("if i  adding 2 weeks in original date: "+ld.plus(pd));
         pd = Period.ofYears(2);
         System.out.println("if i add 2 Years in Original Date"+ld.plus(pd));
         pd = Period.ofDays(10);
         System.out.println("if i add 10 Dayss in Original Date"+ld.plus(pd));
         
         //Add 10 days perion in date
         LocalDate l = LocalDate.of(2020,1, 31);
         Period pd2=Period.ofDays(10);
         l=l.plus(pd2);
         System.out.println("Check date :"+ l);
         
         
         
         // Period class has method between
         
         LocalDate bday = LocalDate.of(1990, Month.JULY, 22);
         Period p1 = Period.between(bday, LocalDate.now()); //spilt up period
         System.out.println("You lived till date for days: "+p1.getDays());
         System.out.println("You lived till date for Years: "+p1.getYears());
         System.out.println("You lived till date for Months: "+p1.getMonths());
         
         
         //ChronoUnit and LocalDate object bethod until
         long days = bday.until(LocalDate.now(),ChronoUnit.DAYS);
         System.out.println("You lived days : "+days);
         long years = bday.until(LocalDate.now(),ChronoUnit.YEARS);
         System.out.println("You lived for years: "+years);
         long months = bday.until(LocalDate.now(),ChronoUnit.MONTHS);
         System.out.println("You lived for Months: "+months);
                 
         
         LocalDate ld4 = LocalDate.of(2000, Month.JULY, 22);
         Period p200 = Period.between(ld4, LocalDate.now());
         System.out.println(" days from ld4 for days: "+p200.getDays());
         System.out.println("years from ld4 for Years: "+p200.getYears());
         System.out.println("months from ld4 for Months: "+p200.getMonths());
         
         
         
    }
}

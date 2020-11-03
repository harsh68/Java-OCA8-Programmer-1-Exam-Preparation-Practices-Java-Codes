/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateTimeAPI;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Harsh
 */
public class DateTimeFoRmator {
    public static void main(String[] args) {
        
        //Use inbuilt pattern constants
        
             // 2050-08-11T14:30:15.312
                    DateTimeFormatter inBuiltFormatter1 = DateTimeFormatter.ISO_DATE_TIME;
                    DateTimeFormatter inBuiltFormatter2 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
            
            
              // 2020-08-11
                    DateTimeFormatter isoLocalDate = DateTimeFormatter.ISO_LOCAL_DATE;
                    DateTimeFormatter isoDate = DateTimeFormatter.ISO_DATE;
        
        
        
              // 14:30:15.312
                    DateTimeFormatter isoTime = DateTimeFormatter.ISO_TIME;
                    DateTimeFormatter isoLocalTime = DateTimeFormatter.ISO_LOCAL_TIME;
        
              // Pattern 
                    DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a");
                    DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss a");
                    DateTimeFormatter format3 = DateTimeFormatter.ofPattern("MMddyyyy");
                    
                    LocalDateTime currentDateTime = LocalDateTime.now();  
                  
                    String formatDateTime = currentDateTime.format(format1);   
                    System.out.println(formatDateTime); 
                 
                    String formatDateTime2 = currentDateTime.format(format2);   
                    System.out.println(formatDateTime2);    
        
                    LocalDate dt = null;
                    
                    try
                    {
                        dt = LocalDate.parse("02022020",format3);
                        
                    }
                    catch(DateTimeException dte)
                    {
                        System.out.print("Bad Date selected ");
                        System.out.println("dt: "+dt);
                        System.exit(0);
                    }
                    System.out.println("Date is: "+dt);
                    System.out.println("Day: "+dt.getDayOfWeek());
                    System.out.println("Day of Month: "+dt.getDayOfMonth());
                    System.out.println("Day of Year: "+dt.getDayOfYear());
                    System.out.println("Month is: "+ dt.getMonth());
                    System.out.println("Year is: "+ dt.getYear());
                  
                    
        
        
        
        
        
        
        
        
    }
}

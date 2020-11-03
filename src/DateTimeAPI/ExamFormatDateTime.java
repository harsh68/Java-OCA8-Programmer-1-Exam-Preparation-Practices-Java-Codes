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
public class ExamFormatDateTime {
    public static void main(String[] args) {
        
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
                    DateTimeFormatter format4 = DateTimeFormatter.ofPattern("E MMM dd, yyyy G");
                    DateTimeFormatter format5 = DateTimeFormatter.ofPattern("k:m:s A a");
                    
                    LocalDateTime d = LocalDateTime.now();
                    String s = d.format(format5);
                    System.out.println("Format5 :"+s);
                    String s1 = d.format(format4);
                    System.out.println("Format4 :"+s1);
                    
                    s1 = d.format(format3);
                    System.out.println("Format3 :"+s1);
                    s1 = d.format(format2);
                    System.out.println("Format2 :"+s1);
                    s1 = d.format(format1);
                    System.out.println("Format1 :"+s1);
                    
    }
}

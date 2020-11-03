/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package values;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Harsh
 */
public class Formatter
{
    
      
public static void main(String args[])
{
    LocalDateTime rightNow = LocalDateTime.now();
    System.out.println("current datetime : " + rightNow);
  
    LocalDateTime aDateTime = LocalDateTime.of(2015, Month.JULY, 29, 19, 30, 59);
    System.out.println("some datetime : " + aDateTime);
  
    LocalDate currentDate = LocalDate.now();
    LocalTime currentTime = LocalTime.now(); 
    LocalDateTime fromDateAndTime = LocalDateTime.of(currentDate, currentTime);
    System.out.println("LocalDateTime created by combining LocalDate" + " and LocalTime" + fromDateAndTime);
    
    LocalDate retrievedDate = fromDateAndTime.toLocalDate(); 
    LocalTime retrievedTime = fromDateAndTime.toLocalTime();
    
    System.out.println("retreived LocalDate : " + retrievedDate);
    System.out.println("retreived LocalTime : " + retrievedTime);
}
 }
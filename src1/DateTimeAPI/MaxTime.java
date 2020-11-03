/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateTimeAPI;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Harsh
 */
public class MaxTime {
    public static void main(String[] args) {
        LocalTime t = LocalTime.MAX;
        System.out.println(t);
        t=LocalTime.MIDNIGHT;
        System.out.println(t);
        t=LocalTime.MIN;
        System.out.println(t);
        
        t=LocalTime.NOON;
        System.out.println(t);
        LocalDate d = LocalDate.MAX;
        System.out.println(d);
        d = LocalDate.MIN;
        System.out.println(d);
        LocalDate d1 = LocalDate.now();
        System.out.println(d1.getDayOfYear());
        LocalTime lt = LocalTime.now();
        System.out.println(lt.getSecond());
        
    }
   
}

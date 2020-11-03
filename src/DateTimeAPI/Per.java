/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateTimeAPI;

import java.time.Period;

/**
 *
 * @author Harsh
 */
public class Per {
    public static void main(String[] args) {
        Period p6 = Period.of(2, 10, 30).plusDays(10).plusMonths(8).plusYears(1); // P4Y6M40D
        System.out.println(p6);
        p6=p6.normalized();
        System.out.println(p6);
        //int i  = Integer.parseInt("1_1");
        Integer wrapper = Integer.valueOf("123");
       // Integer iw = new Integer("3_3");
           Integer i3 = 5;
           Integer i4 = 5;
           System.out.println(i3==i4);
           System.out.println(i3.equals(i4));
           i4++;
           System.out.println(i3==i4);
           System.out.println(i3.equals(i4));
           
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateTimeAPI;

import java.time.LocalDate;

/**
 *
 * @author Harsh
 */
public class ForamtDa {
    public static void main(String[] args) {
        LocalDate d = LocalDate.of(2020, 1, 1);
        System.out.println(d);
        LocalDate p = LocalDate.parse("2020-1-1"); //DateTimeException
        System.out.println(p);
        //use only 9999-99-99 format
    }
}

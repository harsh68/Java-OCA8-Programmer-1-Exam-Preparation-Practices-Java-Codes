/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateTimeAPI;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Harsh
 */
public class FactoryClasses {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2020, 1, 2);
        LocalDate ld2 = LocalDate.now();
        Period pd = Period.of(2019, 12, 25);
        
    }
   
}

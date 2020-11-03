/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewPr1;

import java.time.LocalDate;

/**
 *
 * @author Harsh
 */
public class YearSet {
    public static void main(String[] args) {
        LocalDate xmas = LocalDate.of(2016, 12, 25);
        xmas.setYear(2017);
        System.out.println(xmas.getYear());
    }
}

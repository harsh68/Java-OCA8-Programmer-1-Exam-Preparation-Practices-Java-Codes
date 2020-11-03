/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateTimeAPI;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
/**
 *
 * @author Harsh
 */
public class TemAdjust {
    public static void main(String[] args) {
        LocalDate to = LocalDate.now();
        LocalDate payd = to.with(TemporalAdjusters.lastDayOfMonth()).minusDays(2); //.minusDays(2);
        System.out.println(payd);
        
    }
}

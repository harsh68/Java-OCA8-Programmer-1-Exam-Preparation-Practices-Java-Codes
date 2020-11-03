/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enum;

/**
 *
 * @author Harsh
 */
public class CallMonth {
    public static void main(String[] args) {
        Months m = Months.byOrdinal(3);
        System.out.println(m);
        Months m1 = Months.byOrdinal(0);
        System.out.println(m1);
        String month=Months.DEC.name(); //String type enum to string
        
        // From user get string and convert to enum type
        Months m2 = Months.valueOf("DEC");
    }
}

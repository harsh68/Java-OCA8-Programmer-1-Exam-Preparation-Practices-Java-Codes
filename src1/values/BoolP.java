/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package values;

/**
 *
 * @author Harsh
 */
public class BoolP {
    public static void main(String[] args) {
        boolean log3 = ( 5.0 != 6.0) && ( 4 != 5);
        boolean log4 = (4 != 4) || (4 == 4);
        System.out.println("log3:"+ log3 + "\nlog4" + log4);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lambda;

import java.util.function.Predicate;

/**
 *
 * @author Harsh
 */
public class Pumma {
    public static void main(String[] args) {
        Predicate dash = c -> c.startsWith("-");
        System.out.println(dash.test("–"));
    }
}

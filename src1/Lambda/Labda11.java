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
public class Labda11 {
    public static void main(String[] args) {
        Predicate<String> clear = c -> c.equals("clear");
        System.out.println(clear.test("pink"));
        
        
        Predicate<String> dash = c -> c.startsWith("-");
        System.out.println(dash.test("-"));
    }
}

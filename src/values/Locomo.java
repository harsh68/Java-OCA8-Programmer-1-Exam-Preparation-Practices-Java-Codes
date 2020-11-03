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
public class Locomo {
    Locomo()
    {
        main("hi");
    }
    public static void main(String... args) {
        System.out.print("2 ");
        main("5");
    }
    public static void main(String args) {
        System.out.print("3 "+args);
    }
}

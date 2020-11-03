/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewPr1;

/**
 *
 * @author Harsh
 */
public class LabelTest {

    public static void main(String[] args) {

        first: System.out.println("First statement");
        for (int i = 0; i < 2; i++) {
            System.out.println("Second statement");
            break first;
        }
    }
}

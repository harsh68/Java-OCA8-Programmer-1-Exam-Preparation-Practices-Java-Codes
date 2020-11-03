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
//If the left operand is sufficient to determine the result, the right operand is not evaluated
public class Condition {
    public static void main(String[] args) {
        int y =5;
        int x =56;
        if((y<56) && (x<60) | val())
        {
            System.out.println("ok");
        }
         if((y>56) | (x<60) && val())
        {
            System.out.println("ok2");
        }
    }

    private static boolean val() {
       return true;
    }
}

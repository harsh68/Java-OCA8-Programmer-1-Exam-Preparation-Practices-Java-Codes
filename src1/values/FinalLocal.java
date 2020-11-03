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
public class FinalLocal {
    final int b=12;
    
    public static void main(String[] args) {
        final int a; //local as final
        a=12;
        static int s;
        a=12;
    }
}

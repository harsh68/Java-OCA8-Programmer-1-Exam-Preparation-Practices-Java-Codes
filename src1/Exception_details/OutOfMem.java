/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception_details;

/**
 *
 * @author Harsh
 */
public class OutOfMem {
public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        try {
            for(;;) {
                sb.append("OCA");
            }
        } catch(OutOfMemoryError e) {
            System.out.println("Exception!!!");
        }
        System.out.println("Main ends!!!");
    }
}

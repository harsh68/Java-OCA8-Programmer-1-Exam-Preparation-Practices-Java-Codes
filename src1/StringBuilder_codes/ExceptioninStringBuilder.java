/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringBuilder_codes;

/**
 *
 * @author Harsh
 */
public class ExceptioninStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("HelloWOrldIndianews");
        sb.insert(18,"Exception");
        System.out.println(sb);
    }
}

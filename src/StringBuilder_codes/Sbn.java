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
public class Sbn {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcdef");
        sb.delete(4,1);
        System.out.println(sb);
    }
}

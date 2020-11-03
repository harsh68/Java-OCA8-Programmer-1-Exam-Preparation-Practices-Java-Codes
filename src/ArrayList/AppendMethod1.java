/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

/**
 *
 * @author Harsh
 */
public class AppendMethod1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("1234512342");
        String cc = "HARSHPATEL";
        sb.substring(0, 4);
        System.out.println(sb);
        sb.append(cc, 0, 5);
        System.out.println(sb);
    }
}

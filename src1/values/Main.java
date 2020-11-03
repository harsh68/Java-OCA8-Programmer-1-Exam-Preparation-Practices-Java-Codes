/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package values;


public class Main {
    public static void main(String[] args) {
        String s = "hello";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
       /* if (s == sb) {
            System.out.println("a");
        }*/
        if (s.equals(sb)) {
            System.out.println("b");
        }
        if (sb.equals(s)) {
            System.out.println("c");
        }
    }
}

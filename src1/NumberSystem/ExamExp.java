/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumberSystem;

/**
 *
 * @author Harsh
 */
public class ExamExp {
    public static void main(String[] args) {
      int i1 = Integer.parseInt(args[0]);
        boolean b1 = Boolean.parseBoolean(args[0]);
        System.out.println(i1 + " " + b1);
        int i2 = Integer.valueOf(args[0]);
        boolean b2 = Boolean.valueOf(args[0]);
        System.out.println(i2 + " " + b2);
    }
}

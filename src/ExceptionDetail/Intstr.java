/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionDetail;

/**
 *
 * @author Harsh
 */
public class Intstr {
    public static void main(String[] args) {
        Object i = Integer.valueOf("43");
        System.out.println("i: "+i);
        String s = (String)i;
    }
}

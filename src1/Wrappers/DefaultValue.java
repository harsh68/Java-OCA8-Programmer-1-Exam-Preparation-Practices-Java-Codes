/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wrappers;

/**
 *
 * @author Harsh
 */
public class DefaultValue {
    static Integer i; //Default value null
        static int i2;//Default value 0
    public static void main(String[] args) {
        dostuff(i); //compile fines but null to int (NullPointer Exception at Runtime (No value to unbox
    }

    private static void dostuff(int i) {  //compile fines 
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Harsh
 */
public class Enum {
    public enum Days{MON,Tue,WED};
    public static void main(String args[])
    {
        for(Days d: Days.values())
            ;
        Days d2[] =  Days.values();
        System.out.println(d2[2]);
        
    }
}

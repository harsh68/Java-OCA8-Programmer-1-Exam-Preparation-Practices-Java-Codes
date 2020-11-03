/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoopIng;

/**
 *
 * @author Harsh
 */
public class Notreachable {
    public static void main(String[] args) {
        do
        {
            System.out.println("100");
            //break; // uncomment break reachable
        }while(true);
        System.out.println("bye"); //if comment execute fine
    }
}

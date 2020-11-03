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
public class D {
    
     public static void main(String[] args) {
          boolean flag = true; //at runtime
         //flag boolean flag = true; //compile time not reachable code 
         
         do{
             System.out.println("ee");    
         }while(flag); //boolean variable instead of literal
          System.out.println("dd");
     }
}

//

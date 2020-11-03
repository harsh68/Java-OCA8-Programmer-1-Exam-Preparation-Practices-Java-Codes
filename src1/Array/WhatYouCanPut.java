/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author Harsh
 */
public class WhatYouCanPut {
    public static void main(String[] args) {
        
        //you can put the things which will be implicit convert
        // size also matter.
        
        int[] we = new int[5];
        byte b =5;
        short s = 20;
        char c = 'q';
        we[0] = c;
        we[1] = b;
        we[2]= s;
     //   we[3] = 3.33; //double to int not compatible
      //  we[3] = 3.33f;// float to int not compatible 
        //we[3] = 5.55; //incompatible float to int
        
        
        double[] d = new double[5];
        d[0] = 34.34;
        d[1] = 5.55f;
        d[2] = 'c';
        d[3] = 234;
      
         float[] f = new float[5];
        //f[0] = 34.34;
        f[0] = 5.55f;
        f[2] = 'c';
        f[1] = 234;  
        
        
        char[] ch = new char[5];
        //f[0] = 34.34;
        //ch[2] = 5.55f;
        ch[0] = 'c';
        ch[1] = 234;
        //ch[2] = 97.4;
        
    }
}

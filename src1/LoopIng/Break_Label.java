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
public class Break_Label {
    public static void main(String[] args) {
        
        
        int i,j;
        
        outer:
        for(i=0;i<5;i++)
            inner:
            for(j=0;j<4;j++)
            {
                if(i==1 && j==1) continue outer;
                if(i==2 && j==2) continue inner; //unneccesary label
                if(i==4 && j==1) break outer;
                System.out.println(i+" "+j);
            }
        
        
        
        
        
        
        
        
    }
}

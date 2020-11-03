/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package values;

/**
 *
 * @author Harsh
 */
public class Output {

    public static void main(String[] args) {
        
        foreach:
        for(int j=0;j<5;j++)
        {
            for(int k=0;k<3;k++)
            {
                System.out.print(" "+j);
                if(j==3 && k==1) break foreach;
                if(j==0 || j==2) break;
            }
        }
        
        
        
    }

    
}

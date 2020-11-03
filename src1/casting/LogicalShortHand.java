/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casting;

/**
 *
 * @author Harsh
 */
public class LogicalShortHand {
    public static void main(String[] args) {
        int x=12,y=12;
        
        if(true || (y++ < 10))
        {
            System.out.println("Y: "+y);
        }
        
           if(true | (y++ < 10)) //not shortHand
        {
            System.out.println("Y: "+y);
        }
           
           int i = 2;
           if(i<15)
           {
               
           }
           else if(i<11)
           {
               //not reachable
           }
           else
           {
               
           }
           
           int y1 = 1;
            int z = 1;
            final int x1 = y1>=10 ? y1++ : z++;
            System.out.println("x: "+x1+" y: "+y1+" z: "+z);
    }
    
}

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
public class FeedingSchedule {
    public static void main(String[] args) {
        int x =5,j=0;
        OUTER:
          for(int i=0;i<3;)
              INNER:
              do{
                  i++;
                  x++;
                  if(x>10) break INNER;
                  x+=4;
                  j++;
              }while(j<2);
     
        System.out.println(x);
        
        double d = 0b1110111;
        float f = 55;
        System.out.println(10/3);
        System.out.println(10.0/3);
        System.out.println(10/3.0);
        System.out.println(10.0/3.0);
        System.out.println(10.55%3);
        System.out.println(-10.343f%5);
        short s1=3,s2=5,ans;
        //ans = s1+s2; //ans must be int type
        
    }
    
}

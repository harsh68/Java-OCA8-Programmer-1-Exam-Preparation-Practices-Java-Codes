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
public class LoopW {
    public static void main(String[] args) {
        int count=10;
        char ch[] = {'1','2'};
         char ch2[] = {'a','b','c','d','e','f'};
          for(char ch1:ch)
            for(char c2:ch2)
            {
                if(c2=='1') break;
                ++count;
            }
        System.out.println("Outer?"+count);
        
        for(char c1:ch)
            for(char c2:ch2)
            {
                System.out.print(c2);
            }
            System.out.println("");
            
            
        
        System.out.println("\\");
       
    }
    
}

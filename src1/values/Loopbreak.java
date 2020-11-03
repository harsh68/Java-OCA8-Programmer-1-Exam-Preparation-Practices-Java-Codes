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
public class Loopbreak {
    public static void main(String[] args) {
      
        //Labeled break statem
        //ent is used to terminate the outer loop, the loop should be labeled for it to work.
       outer_label:
        while(true)
        {
            int z =0;
            while(true)
            {
                if(z>=10)
                    break outer_label;
                else
                    System.out.println(z++);
            }
        }
        
       
    }
}

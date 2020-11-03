/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewPr1;

/**
 *
 * @author Harsh
 */

    public class LoopDeLoop
    {
        public static void main(String[] args)
        {
   
        StringBuilder meals[] = {new StringBuilder(), new StringBuilder(), new StringBuilder()};
     
        for (StringBuilder meal : meals) meal.insert(0, "FreeMeal");
        for (StringBuilder meal : meals) 
               System.out.print(meal + "|");
}
}
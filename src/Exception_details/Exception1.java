/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception_details;

import java.io.IOException;

/**
 *
 * @author Harsh
 */

/*
Once control jumps to the catch block, it never returns to complete
the balance of the try block. 

Even if there is a return statement in the try block, the finally block
executes right after the return statement is encountered and before the return executes!

The
handlers for the most specific exceptions must always be placed above those for more general exceptions.

If one Exception class is
not a subtype or supertype of the other, then the order in which the catch clauses are placed doesn’t
matter.

*/
public class Exception1 {
    public static void main(String[] args) {
        
        int a = dis();
        System.out.println(a);
    }
   private static int dis() {
    try
        {
         return 5;        
        }
        catch(ArithmeticException e)
        {
                
        }
        finally
        {
            System.out.println("tre");
        }
    return 34;
    }
}

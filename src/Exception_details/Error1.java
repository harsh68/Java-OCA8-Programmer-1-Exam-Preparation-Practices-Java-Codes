/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception_details;

/**
 *
 * @author Harsh
 */

/*
Error is runtime so it will compile ,but if you use Exception class than it ll not able to catch
*/
public class Error1 {
    public static void main(String[] args) {
        try
        {
            new Error1().go();
        }
        catch(Error e) //if you use Exception instead of 
        {
            System.out.println("Caught");
        }
        
    }
    void go()
    {
        go();
    }
}

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
public class Sleep 
{
    public static void snore() //throws java.lang.Exception
    {
            try
            {
                String sheep[] = new String[3];
                System.out.print(sheep[3]);
            }
            catch (RuntimeException e) {
                    System.out.print("Awake!");
            } finally
            {
                    throw new java.lang.Exception(); // x1
            }
}
public static void main(String... sheep) { // x2
new Sleep().snore(); // x3
}
}

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
public class Computer 
{
    public void compute() throws java.lang.Exception
    {
        throw new RuntimeException("Error processing request");
    }

        public static void main(String[] bits)
        {
            try
            {
                new Computer().compute();
                System.out.print("Ping");
            }
            catch (NullPointerException e)
            {
                System.out.print("Pong");
                throw e;
            }
        }
}

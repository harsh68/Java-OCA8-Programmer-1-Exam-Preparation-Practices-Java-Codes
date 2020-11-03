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
    class Organ
    {
        public void operate() throws RuntimeException,java.lang.Exception {
        throw new RuntimeException("Not supported");
        }
    }

    public class Heart extends Organ
    {
        public void operate() throws java.lang.Exception
        {
            System.out.print("beat");
        }

        public static void main(String... cholesterol) throws java.lang.Exception
        {
            try
            {
                new Heart().operate();
            }
            finally
            {
            }
        }
}

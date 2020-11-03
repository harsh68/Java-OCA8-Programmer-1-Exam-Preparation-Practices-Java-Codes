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
interface Source
{
        void flipSwitch() throws java.lang.Exception;
}

    public class LightBulb implements Source
    {
        @Override
        public void flipSwitch() {
            try 
            {
                    //throw new RuntimeException("Circuit Break!");
            }
            finally
            {
                System.out.print("Flipped!");
            }
}
public static void main(String... electricity) throws Throwable {
final Source bulb = new LightBulb();
bulb.flipSwitch();
}
}

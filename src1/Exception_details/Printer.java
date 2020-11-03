/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception_details;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Harsh
 */
    public class Printer
    {
        public void print()
        {
            try
            {
                throw new FileNotFoundException();
            }
            catch (IOException exception)
            {
                System.out.print("Z");
            } 
            catch (FileNotFoundException enfe)
            {
                    System.out.print("X");
            }
            finally
            {
                System.out.print("Y");
            }
}
public static void main(String... ink) {
new Printer().print();
}
}

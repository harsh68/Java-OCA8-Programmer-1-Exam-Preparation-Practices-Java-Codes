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
    public class Backup
    {
        public void performBackup() 
        {
            try
            {
                throw new IOException("Disk not found");
            }
            catch (java.lang.Exception e)
            {
                try
                {
                    throw new FileNotFoundException("File not found");
                }
                catch (FileNotFoundException e)
                { // z1
                    System.out.print("Failed");
                }
            }
        }
        
        public static void main(String... files)
        {
            new Backup().performBackup(); // z2
        }
}
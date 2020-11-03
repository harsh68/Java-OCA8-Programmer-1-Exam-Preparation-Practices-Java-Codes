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
public class ExceptionRep {
    public static void main(String[] args) {
        try{
           throw new IOException(); 
        }
        catch(IOException | RuntimeException e)
        {
            
        }
    }
}

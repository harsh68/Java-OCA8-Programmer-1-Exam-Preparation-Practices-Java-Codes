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
class Kite
{
    void rty() //throws FileNotFoundException
    {
        //throw new FileNotFoundException();
        try
        {
            throw new IOException();
        }
        catch(java.lang.Exception e)
        {
            
        }
    }
}
public class Checked2 {
    public static void main(String[] args) {
        new Kite().rty();
    }
   
}

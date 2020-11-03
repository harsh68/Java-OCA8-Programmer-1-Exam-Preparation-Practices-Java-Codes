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
class Pqr
{
    void disco() throws IOException
    {
        try
        {
        throw new IOException();
    
        }
        catch(RuntimeException e)
        {
        }
        
    }
}
public class CheckeExc {
    public static void main(String[] args) {
        Pqr ob = new Pqr();
        ob.disco();
    }
}

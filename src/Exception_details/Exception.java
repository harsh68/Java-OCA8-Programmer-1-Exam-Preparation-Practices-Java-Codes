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
class A
{
    //you must declare checked exception
    void din() throws IOException 
    {
       
        throw new IOException("My message");
        
    }
    void frt() throws Throwable
    {
        throw new Throwable();
    }
}
public class Exception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    try
    {
        A ob = new A();
        ob.din();
    }
    catch(IOException e)
    {
        System.out.println("Handle in main");
    }
    
    
    }
    
}

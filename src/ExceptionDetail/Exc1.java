/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionDetail;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Harsh
 */
class A
{
    void dispaly() throws IOException
    {
        
    }
}
class B extends A
{
    @Override
    void dispaly() throws FileNotFoundException
    {
        
    }
}
public class Exc1 {
    public static void main(String[] args) throws FileNotFoundException {
        A ob = new B();
        try
        {
        ob.dispaly();
        }
        catch(IOException e)
        {
            
        }
        
    }
    
}

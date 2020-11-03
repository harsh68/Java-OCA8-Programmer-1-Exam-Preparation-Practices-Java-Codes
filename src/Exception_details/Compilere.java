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
class Dec1
{
    void fty1() throws java.lang.Exception
    {
        throw new IOException();
    }
}
public class Compilere {
    public static void main(String[] args) {
        Dec1 d = new Dec1();
        try
        {
        d.fty1(); //no need to surround try catch statement
        }
        catch(IOException i)
        {
            System.out.println("IO");
        }
        catch(java.lang.Exception e) //must write bcz throws Exception
        {
            System.out.println("caught");
        }
        
    }
}

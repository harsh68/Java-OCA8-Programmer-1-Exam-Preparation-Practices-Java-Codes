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
class Dec
{
    void fty() throws RuntimeException
    {
        throw new IllegalArgumentException("Exc");
    }
}
public class Runtim {
    public static void main(String[] args) {
        Dec d = new Dec();
        try
        {
        d.fty(); //no need to surround try catch statement
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("caught");
        }
        
        
        d.fty();
    }
}

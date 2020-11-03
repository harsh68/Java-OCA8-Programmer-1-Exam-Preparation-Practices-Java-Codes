/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionDetail;

import java.io.IOException;

/**
 *
 * @author Harsh
 */
class Hjk
{
    void googl() throws IOException
    {
        throw new IOException();
    }
}
public class CheckedExE {
    public static void main(String[] args) {
        try
        {
            new Hjk().googl();
        }
        catch(Exception e)
        {
            System.out.println("caugth");
        }
    }
}

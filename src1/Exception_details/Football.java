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
public class Football
{
    public static void main(String officials[])
    {
        try
        {
            System.out.print('A');
            throw new RuntimeException("Out of bounds!");
        }
        catch (ArrayIndexOutOfBoundsException t)
        {
            System.out.print('B');
            throw t;
        }
        finally 
        {
            System.out.print('C');
        }
}
}
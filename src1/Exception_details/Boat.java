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
class CapsizedException extends java.lang.Exception {}
class Transport
{
    public void travel() throws CapsizedException { throw new CapsizedException(); };
}
public class Boat
{
    public int travel() throws java.lang.Exception { return 4; }; // j1
    public static void main(String... distance) throws java.lang.Exception
    {
        try
        {
            new Transport().travel();
            //System.out.println(i);
        }
        
        catch (java.lang.Exception e)
        {
                System.out.print("jh");
        }
}
}
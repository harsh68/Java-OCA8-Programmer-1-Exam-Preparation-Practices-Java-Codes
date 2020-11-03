/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomeException;

/**
 *
 * @author Harsh
 */
class MyExc extends Exception
{
    
}

class Tire
{
    void dostuff(){}
}
public class CustomeExc extends Tire {
    public static void main(String[] args) {
        try
        {
        new CustomeExc().dostuff();
        }
        catch(MyExc e)
        {
            
        }
    }
    
    @Override
    void dostuff() throws MyExc  //Override CustomeException  custom exception is identical to the checked exception 
    {
        System.out.println(7/0);
    }
}

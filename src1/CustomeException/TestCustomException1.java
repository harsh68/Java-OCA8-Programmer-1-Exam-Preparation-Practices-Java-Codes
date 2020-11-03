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
class InvalidAgeException extends Exception
{
    InvalidAgeException(String s)
    {
     super(s);   
    }
}

class TubeException extends InvalidAgeException
{
    TubeException()
    {
        super("Exception ");
    }
    
} 
public class TestCustomException1 {
    
    static void validate(int age) throws InvalidAgeException
    {
        if(age<18)
        {
            throw new TubeException();
        }
        else
        {
            System.out.println("Welcome for Vote");
        }
    }
    public static void main(String[] args) {
        try
        {
            validate(8);
        }
        catch(InvalidAgeException iv)
        {
            System.out.println("Exception occured:"+ iv);
        }
    }
}

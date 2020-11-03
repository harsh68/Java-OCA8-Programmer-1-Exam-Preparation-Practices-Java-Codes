/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionDetail;

/**
 *
 * @author Harsh
 */
class BubbleException extends Exception {}
class Fish
{
    Fish getFish() throws BubbleException
    {
        throw new RuntimeException("fish!");
    }
}
public final class Clownfish extends Fish
{
    public final Clownfish getFish() 
    {
            throw new RuntimeException("clown!");
    }

    public static void main(String[] bubbles) throws BubbleException
    {
        final Fish f = new Clownfish();
        f.getFish();
        System.out.println("swim!");
    }
}

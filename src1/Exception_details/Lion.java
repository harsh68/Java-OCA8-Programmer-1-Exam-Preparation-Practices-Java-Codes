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
class BigCat
{
    void roar(int level) throws RuntimeException
    { // m1
        if(level<3) 
            throw new IllegalArgumentException("Incomplete");
        System.out.print("Roar!");
    }
}
public class Lion extends BigCat
{

    public void roar()
    { // m2
        System.out.print("Roar!!!");
    }

    public static void main(String[] cubs)
    {
        final BigCat kitty = new Lion(); // m3
        kitty.roar(2);
    }
}
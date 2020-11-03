/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author Harsh
 */
interface Foods
{
    void beFriendly();
}
class Dogi implements Foods
{
    @Override
    public void beFriendly()
    {
        System.out.println("Dogi Class");
    }
}
class Beagle extends Dogi implements Foods
{
    @Override
    public void beFriendly()
    {
        System.out.println("Beale Class");
    }
}
public class Demo2 {
    public static void main(String a[])
    {
        Foods f = new Beagle();
        f.beFriendly();
    }
}

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
interface I1
{
    default void doStuff(){}
}
interface I2
{
    default void doStuff(){}
}
public class NewClass4 implements I1,I2 {
    @Override
    public void doStuff()
    {
        
    }
    public static void main(String a[])
    {
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Harsh
 */
interface I1
{
    default void def(){
        System.out.println("hello in I1");
    }
    
}
interface I2 extends I1
{
    default void def(){
        System.out.println("hello in I2");
    }
    
}
public class Version implements I2,I1{

    @Override
    public void def()
    {
        I2.super.def();
        System.out.println("in version");
    }
    public static void main(String[] args) {
        Version v = new Version();
        v.def();
    }
    
}

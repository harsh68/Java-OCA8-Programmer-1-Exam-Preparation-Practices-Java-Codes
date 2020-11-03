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
class Abc extends RuntimeException
{
    
}
public class Dump1 {
    public static void main(String[] args) {
        try
        {
            method1();
        }
        catch(Abc e)
        {
            System.out.println("A");
        }
    }
    
    static void method1()
    {
        try
        {
            throw new Abc();
        //throw Math.random() >0.5? new Abc(): new RuntimeException();
        }
        catch(RuntimeException e)
        {
            System.out.println("B");
        }
    }
}

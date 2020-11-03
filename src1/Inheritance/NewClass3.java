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
interface C11 extends A11,B11
{
    
    void csP();
}
interface A11
{
    void asP();
}
interface B11
{
    void bsP();
}

public class NewClass3 implements C11,A11 {
    
    @Override
    public void asP()
    {
        
    }
    @Override
    public void bsP()
    {
        
    }
    @Override
    public void csP()
    {
        
    }    
    public static void main(String a[])
    {
        C11 c = new NewClass3();
        B11 b = new NewClass3();
        b.bsP();
    }
    
}

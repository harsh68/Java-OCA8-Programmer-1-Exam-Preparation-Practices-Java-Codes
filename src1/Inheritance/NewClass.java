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
interface Pqr
{
    void news();
}
abstract class Abc{
    public void revolve(){}
    abstract void rotate();
}
public class NewClass extends Abc implements Pqr {
    
    
    @Override
    public void news()
    {
        
    }
     @Override
     public void revolve()
    {
        
    }
    
    @Override
    void rotate()
    {
        
    }
    
}

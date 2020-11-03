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
interface v1
{
    
}
interface v2
{
    void div();
}
public class Access implements v1,v2
{
   
    @Override
    public void div() {
    }
    int div(int a)
   {
       int i=9;
       return i;
   }
}

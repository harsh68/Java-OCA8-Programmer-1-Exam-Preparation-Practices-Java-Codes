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
interface n1
{
    int A=10;
    public abstract void di();
}
interface n2
{
    int A=10;
    public abstract void di();
}
public class NewClass implements n2,n1 {
    @Override
    public void di()
    {
        System.out.println(n1.A);
        
    }
    public static void main(String a[])
    {
        NewClass nc = new NewClass();
        
    }
}

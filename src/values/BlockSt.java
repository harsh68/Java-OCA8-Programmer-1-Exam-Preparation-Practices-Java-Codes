/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package values;

/**
 *
 * @author Harsh
 */
class A55
{
   
    
}
public class BlockSt {
    public static void main(String[] args) 
    {
        int a = 10;
        int b = 12;
 
    block1:
        {
            if (a < 0) 
            {
                break block1;
            }
        if (b < 0)
            {
                break block1;
            }
            System.out.println( a + b );
        }
}
    }

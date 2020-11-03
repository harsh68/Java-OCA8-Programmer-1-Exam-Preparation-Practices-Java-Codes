/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewPr1;

/**
 *
 * @author Harsh
 */
class Par
{
    
}
class Chi extends Par
{
    int i;
    Chi()
    {
        super();
        System.out.println("disney");
    }
    Chi(int i)
    {
        this.i = this.i;
    }
    
}
public class NewClass2 {
    public static void main(String[] args) {
        Chi c = new Chi(12);
        System.out.println(c.i);
    }
}

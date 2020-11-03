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
   class der5
{
    int a =34;
    {
        int a =45;
    }
    void prt()
    {
        System.out.println(a);
    }
}
public class Scope {
    public static void main(String[] args) {
        der5 ob = new der5();
        System.out.println(ob.a);
        
        ob.prt();
    }
}

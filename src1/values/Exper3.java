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
public class Exper3 {
    int a;
    public static void main(String a[])
    {
        Exper3 e1 = new Exper3();
        e1.a =15;
        Exper3 e2 = e1;
        
        if(e1 == e2)
        {
            System.out.println("Match address");
        }
        if(e1.equals(e2))
        {
            System.out.println("Match Properties");
        }
        e1.a =30;
       // e2 = new Exper();
        e2.a = 50;
         if(e1 == e2)
        {
            System.out.println("Match address");
        }
        if(e1.equals(e2))
        {
             System.out.println("Match Properties");
        } 
        else
        {
           
        }
        
        
    }
}

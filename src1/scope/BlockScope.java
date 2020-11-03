/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scope;

/**
 *
 * @author Harsh
 */
public class BlockScope {
    int a = 67;
    {
        int a = 90;
    }
    BlockScope()
    {
        System.out.println(a);
    }

    void f()
    {
        int y=23;
        {
           // int y = 45;
        }
    }
    public static void main(String args[]) 
    { 
        int x = 15;
         { 
             x = 10; //int x 
             System.out.println("inblock"+x); 
         } 
          System.out.println("Out:"+x);
       new BlockScope();
    } 
} 
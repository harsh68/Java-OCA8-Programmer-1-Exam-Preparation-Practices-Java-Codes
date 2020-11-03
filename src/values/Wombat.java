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
public class Wombat implements Runnable{
    private int i;
    public synchronized void run()
    {
       // if(i%5 != 0){i++;}
        for(int x=0;x<5;x++,i++)
        {
            if(x>1)
              Thread.yield();
            
        }
        System.out.println(i+"");
    }
    public static void main(String bang_a_gong[]) {
        Wombat n = new Wombat();
        Wombat m = new Wombat();
        
        for(int x=100;x>0;--x)
        {
            new Thread(n).start();
            
          
        }
    }
}

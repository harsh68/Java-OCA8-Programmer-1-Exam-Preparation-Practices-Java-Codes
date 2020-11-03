/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gc;

import java.util.Date;

/**
 *
 * @author Harsh
 */
public class Code {
    static int count;
    public static void main(String[] args) {
        Date d;
        d = null;
        for(int i=0;i<4;i++)
        {
            d = new Date();
            d = null;
        }
        System.out.println(count);
    }
     @Override
    protected void finalize() throws Throwable
    {
        try {    
            count++;
        } finally {
            super.finalize();
        }
    }
    
}

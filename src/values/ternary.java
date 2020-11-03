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
public class ternary {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);
        byte a=40,b=50;
        byte ans = (byte)(a+b);
        ans = (byte)a+b; //become int
        ans = (byte)a+b; //two byte sum become int
        
        short s =2*(short)(x); // bcz again cast to int
        
         long x1 = 10;
         int y = 2 * (int)x1;
         byte p =78;
         byte q = 90;
         double dd = p + q;
         int dd1 = p + q;
         long dd2 = p + q;
         float dd3 = p + q;
    }
}

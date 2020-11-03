/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casting;

/**
 *
 * @author Harsh
 */
public class Sign {
   
    public static void main(String[] args) {
        byte b = (byte)128;
        byte b1 = 7;
        //b1 = (byte)(b1+3);
        b1+=3;
        short s = 10;
        //s=(short)(s+7);
        s+=7;
        int a =10;
        float f = 23.44f;
        //a = f+a;
        //f=f+a;
        a+=f;
        System.out.println(a);
    }
}

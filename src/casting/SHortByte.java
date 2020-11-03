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
public class SHortByte {
    public static void main(String[] args) {
        short s1=10,s2=23,ans,s3;
        s3=s1++;
        //unary operator use with short or byte resulting is same data type instead of int
       // ans = s1+s2; //ans required here int type
       double d = 3.44;
       float f =2.1f;
       // always double = [float] op [double]
       //promoted to larger datatype
        System.out.println(" "+ (d+f));
        
        double x = 2;
        int y = 7;
        float z =9;
        System.out.println(x*y/z);
        System.out.println(5/4);
        System.out.println(4*5/4+2);
        System.out.println((int)1111111111111111111L);
                
        long x1 = 4666666666666L;
        long x2 = 2333;
        
        
        if(d>f)
        {
            System.out.println("two different data type with relation op. automatic cast with larger and resulting in boolean");
        }
        
    }
}

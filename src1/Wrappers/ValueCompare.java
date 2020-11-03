/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wrappers;

/**
 *
 * @author Harsh
 */
/*
object interning. Java interns small numbers (less than 128), 
so all instances of Integer(n) with n in the interned range are the same. 
Numbers greater than or equal to 128 are not interned, hence Integer(1000) objects are not equal to each other.
*/
public class ValueCompare {
    public static void main(String[] args) {
        Integer i1 =127;
        Integer i2 = 127;
        if(i1==i2){
            System.out.println("same");
        }
        Integer i3 = 128;
        Integer i4 = 128;
        if(i3==i4)
        {
            System.out.println("Never Display");
            //i3!=i4
        }
        /*
        When == is used to compare a primitive to a wrapper, the wrapper will be unwrapped and the
comparison will be primitive to primitive.
        */
        if(i4==128)
        {
            System.out.println("Check Output");
        }
        
        Integer i5 = 1000;
        if(i5==1000)
        {
            System.out.println("Print 1000");
        }
        Integer i6 = 1000;
        if(i5==i6) 
        {
            System.out.println("Range !!");
            //Here i5!=i6
        }
        
        
        Short s = 128;
        Short s1 = 128;
        if(s==s1)
        {
            System.out.println("Short same");
        }
        s=127;
        s1=127;
         if(s==s1)
        {
            System.out.println("Short same 127");
        }
    }
}

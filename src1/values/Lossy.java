/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package values;

/**
 *
 * @author Harsh
 * 
 * byte b = 2
 * 
 * 0000 0010 =2 inform of int
 * b= 127
 * 0111 1111 = 127
 * 
 * 1111 1111 = -128
 * 
 * probably values for byte inform of int
 * -128<= byte <=127
 *  -32,768<=short<=32,767
 * 
 */
public class Lossy {
    public static void main(String[] args) {
        
        byte b =2;
        switch(b)
        {
            case 16:
                System.out.println("Valid case 2*8 = 16 ");
                break;
            case 64:
                System.out.println("Valid");
                break;
            case 127:
                System.out.println("Valid");
                break;
            // case 128: invalid
                
        }
        
        short s =32766;
        switch(s)
        {
            case 32761:
                  break;
            case 32767:
                break;
            //case 32768:
              //  break;
        }
        
    }
}

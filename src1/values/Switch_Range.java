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
public class Switch_Range {
   // byte  -128 to 127
   // short -32768 to 32767
    // int -2,147,483,648 to 2,147,483,647
    
    public static void main(String[] args) {
       byte b =2;
       short s = 32767;
       switch(b)
       {
           case 2:
           case -1_28:
           case 127:
           //case -129: // invalid outof range of byte compile time error
           //case 129: // invalid outof range of byte compile time error
           //case 130: // invalid outof range of byte compile time error
       }
       
       switch(s)
       {
           case 2:
           case -32768:
           case 32767:
           case 32_760:
           //case -32769:: // invalid outof range of byte compile time error
           //case 32768: // invalid outof range of byte compile time error
           //case 32770: // invalid outof range of byte compile time error
       }
       Character ch = 'A';
       switch(new Integer(4))
       {
           case 4:
               System.out.println("___Hello_");
               break;
       }
       
        switch(new Character('A'))
       {
           case 65:
               System.out.println("A___Hello_");
               break;
       }
      
    }
}

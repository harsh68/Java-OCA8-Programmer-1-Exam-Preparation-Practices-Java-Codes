/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package values;
public class First {
    public static void main(String[] args) {
        final int a = 9; //constant and initialize with declaration, so u can use case a:
        final int b;
        b=4; // cant use with case b: 
        final int c = 7;
        //b=45;
        int d =4;
        //label as variable name (with case) only use constant case a: 
        switch(a)//agument can be anything
        {            
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("World");
                break;
            default:
                System.out.println("Newss");
            case a: //use only constant or final variable which initialize immediately 
                System.out.println("India");
                break;
           /* case b:
                System.out.println("NJ");
                break;*/
            case c:  //if you use final variable with case in switch case it must initialize while declaration
                // a & c variable must not have same value when you use with label
                System.out.println("NJ");
                break;       
           /*case d:   //variable d should be constant resolve at compile time 
                System.out.println("NJ");
                break;*/
        }
        
        char ch = 'A';
        switch(ch)
        {
            case 65:
       //   case 'A': // dublicate class label
       //   case ch:  //constant required         
        }
    }
}

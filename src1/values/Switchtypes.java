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
public class Switchtypes {
    public static void main(String[] args) {
        int a = 012;
        switch(a)
        {
            case 10:
                System.out.println("convert of ocal to int in expression");
                break;
        }
        
        int b = 0Xa;
        switch(b)
        {
            case 10:
                System.out.println("convert of Hex to int in expression");
                break;
        }
        
        int c = 0B1010;
        switch(c)
        {
            case 10:
                System.out.println("convert of Boolean to int in expression");
                break;
        }
    }
}

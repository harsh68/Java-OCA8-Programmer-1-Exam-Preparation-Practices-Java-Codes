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
public class Switcheroo {
public static void main(String[] args) {
final int iLoc = 3;
final Integer iFour = 4;
Integer iRef = 4;
    switch (iRef)
    {
        case iFour:
        System.out.println("It’s OK.");
        case 1:
        case iLoc:
        case 2 * iLoc:
        System.out.println("I am not OK.");
        default:
        System.out.println("You are OK.");
    }
    
    byte b =22;
    final Byte b1 = 22;
    switch(b)
    {
        case b1:
            break;
    }
}
}

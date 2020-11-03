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
public class Byt {
    //byte range -128 to 127
    
    public static void main(String[] args) {
        byte b = 127;
    byte c = (byte)128;
    byte d = (byte)130.56;
    byte a = 8;
    byte e = 12;
    byte f = (byte)(a+e); // expression with int or lower than int always results in int
    }
}

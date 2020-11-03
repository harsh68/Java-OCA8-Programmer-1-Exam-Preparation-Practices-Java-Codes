/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticpck;

/**
 *
 * @author Harsh
 */
public class MathFn {
    public static void Addint(int z, int amount)
    {
        z=z+amount;
    }
    
    public static void main(String[] args) {
        int x =10;
        int y = 15;
        MathFn.Addint(x, y);
        System.out.println(x);
    }
}

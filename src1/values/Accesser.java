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
public class Accesser {
    public static void main(String a[])
    {
        Encap e = new Encap();
        e.setSize(20);
        int n = e.getSize();
        System.out.println(n);
        e.setColor("Blue");
        Encap e1 = e.getColor();
        System.out.println(e1.getSize());
        
    }
}

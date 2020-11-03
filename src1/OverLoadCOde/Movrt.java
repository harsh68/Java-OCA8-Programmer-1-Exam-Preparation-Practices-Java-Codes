/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OverLoadCOde;

/**
 *
 * @author Harsh
 */
class SDF
{
    void dis(short s)
    {
        System.out.println("sh");
    }
    void dis(int i)
    {
        System.out.println("in");
    }
}
public class Movrt {
    public static void main(String[] args) {
         byte b = 8;
        new SDF().dis(b);
        
    }
}

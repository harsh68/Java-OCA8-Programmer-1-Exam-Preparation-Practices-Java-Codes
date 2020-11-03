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
class VCf
{
    void pop(int a)
    {
        System.out.println("int");
    }
     void pop(Integer a)
    {
        System.out.println("INT Wrappper");
    }
}
public class Ajk {
    public static void main(String[] args) {
        new VCf().pop(new Integer(34));
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author Harsh
 */
class W{}
class K extends W {}
class Base
{
    W pare()
    {
        System.out.println("Base class");
        return new K();
    }
}
class Derive extends Base
{
    @Override
    K pare()
    {
        System.out.println("derive method");
        return new K();
    }
}
public class COvariant {
    public static void main(String[] args) {
        Base b = new Derive();
        b.pare();
    }
}

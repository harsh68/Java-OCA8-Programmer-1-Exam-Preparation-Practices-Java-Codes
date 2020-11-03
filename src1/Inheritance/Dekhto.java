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
class fgt
{
    int y;
    void ty()
    {
        
    }
}
class qwe extends fgt
{
    void gty()
    {
     super.ty();
     int lo = super.y;
    }
}
public class Dekhto extends qwe {
    public static void main(String[] args) {
        int yu = super.y; //static method::
    }
}

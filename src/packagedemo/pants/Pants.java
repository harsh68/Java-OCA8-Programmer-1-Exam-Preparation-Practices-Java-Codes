/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packagedemo.pants;
//import packagedemo.*;
import packagedemo.Shirt;
import static packagedemo.Shirt.a;
import static packagedemo.Shirt.displayshirt;


/**
 *
 * @author Harsh
 */
public class Pants {
    public void use()
    {
        String sh = displayshirt();
        int var = Shirt.a;
        System.out.println(" "+sh);
    }
    public static void smethod()
    {
        String sh = Shirt.displayshirt();
        int var = Shirt.b;
        System.out.println(" "+sh);
    }
    public static void main(String[] args) {
        Pants p = new Pants();
        p.use();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewPr1;

/**
 *
 * @author Harsh
 */
public class Valeql {
    int a;
    public static void main(String[] args) {
        Valeql v = new Valeql();
        Valeql v1 = new Valeql();
        
        System.out.println(v.equals(v1));
        v=v1;
         System.out.println(v.equals(v1));
    }
    
}

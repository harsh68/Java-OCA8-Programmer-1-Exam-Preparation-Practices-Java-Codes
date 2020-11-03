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
public class Enum {
    enum Color{RED,BLUE};
    public static void main(String[] args) {
        
        // for enum == or equals() behave same
        Color c1 = Color.BLUE;
        Color c2 = Color.BLUE;
        System.out.println(c1==c2);
        System.out.println(c1.equals(c2));
        Color c3 = Color.RED;
        System.out.println(c1==c3);
        System.out.println(c1.equals(c3));
    }
}

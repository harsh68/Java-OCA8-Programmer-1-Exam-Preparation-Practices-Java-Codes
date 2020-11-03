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
public class Dolls {
public void nested() { nested(2,true); } // g1
public int nested(int level, boolean height) { return nested(level); }
public int nested(int level) { return level+1; }; // g2
public static void main(String[] outOfTheBox) {
System.out.print(new Dolls().nested());
}
}

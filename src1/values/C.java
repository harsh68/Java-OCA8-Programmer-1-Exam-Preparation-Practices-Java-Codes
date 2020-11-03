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
public class C {
    static String seq = "C";
    static { seq+="g";}
    {seq+="Z";}
    public static void main(String[] args) {
        C c1 = new C(); // CgZ
        C c2 = new C(); // CgZZ
        System.out.println(c1.seq);
    }
}

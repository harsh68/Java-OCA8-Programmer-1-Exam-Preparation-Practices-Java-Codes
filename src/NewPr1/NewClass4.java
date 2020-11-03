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
public class NewClass4 {
    static Integer i=34;
    static Float f =34.34f;
    public static void main(String[] args) {
        System.out.println(i.compareTo(34));
        System.out.println(f.compareTo(34.34f));
        
        Integer u = new Integer(5);
        System.out.println(u);
        
         Integer u1 = new Integer("65");
        System.out.println(u1);
        
        Boolean b = new Boolean(null);
        System.out.println(b);
        
        Integer u3 = new Integer(null);
        System.out.println(u3);
    }
}

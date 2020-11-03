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
public class Turn {
    public static void main(String[] args) {
        int i=98;
        String s = (i>100)?"ok":(i>98)?"lk":"pl";
        System.out.println(s);
        Turn t = new Turn();
        Turn t2 = new Turn();
        System.out.println(t.equals(t2));
        t2=t;
        System.out.println(t.equals(t2));
     long f =56;
    }
 
}

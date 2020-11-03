/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author Harsh
 */
public class Beaware {
    public static void main(String[] args) {
        int[] val;
        int[] dell = new int[3];
        val = dell;
        System.out.println(val.equals(dell));
        System.out.println(val==dell); 
        dell =null;
        char[] ch1 = new char[5];
       // ch1 = val; //like primitive , we cant convert int[] to char[] 
       Beaware b = new Beaware();
       Beaware b1 = new Beaware();
        System.out.println(b.equals(b1));
        b=b1; // now class object == and .equals same
        System.out.println(b.equals(b1));
       
    }
    
}

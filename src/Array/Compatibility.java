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
public class Compatibility {
    public static void main(String[] args) {
        long[] l = {1,2,3,4};
        int[] i = {23,23,23,23}; //eventhough char ,long,int compatible but in form of [] its not
        char[] ch = {'A','B','C'};
        l=i;
        i=ch;
    }
  
}

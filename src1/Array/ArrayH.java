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
public class ArrayH {
    public static void main(String[] args) {
        int n1[] = new int[3];
        int n2[] = {12,13,14,15,16,17};
        n1=n2;
        for(int i:n1)
        {
            System.out.println(i);
        }
    }
}

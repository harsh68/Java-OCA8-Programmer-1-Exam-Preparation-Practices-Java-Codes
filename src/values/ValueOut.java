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
public class ValueOut {
    public static void main(String[] args) {
        int i =10;
        int j =20;
        int k = j +=i/5;
        
        System.out.println("i: "+i+ " j:"+j+" k:"+k);
        int m = j =34;
        System.out.println("m: "+m +" "+" j:"+ j);
    }
}

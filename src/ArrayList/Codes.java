/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;

/**
 *
 * @author Harsh
 */
public class Codes {
    
public static void main(String[] args) {
ArrayList<Integer> original = new ArrayList<>();
original.add(new Integer(10));
Integer i = original.get(0);
ArrayList<Integer> cloned = (ArrayList<Integer>) original.clone();
Integer i1 = cloned.get(0); //both objects point same location
++i1;// change location
System.out.println(cloned);
    System.out.println(original);
}
}
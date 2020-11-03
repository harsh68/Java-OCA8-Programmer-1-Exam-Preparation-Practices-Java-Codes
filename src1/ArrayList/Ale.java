/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Harsh
 */
public class Ale {
    public static void main(String[] args) {
        ArrayList lst = new ArrayList(10);
       // System.out.println(lst.capacity());
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        
        List<String> one = new ArrayList<>();
 List<String> two = new ArrayList<>();
 System.out.println(one.equals(two)); // true
 System.out.println(one==two);//false
 one=two;
 System.out.println(one==two);//true
        one.add("u");
        System.out.println(two);
    }
}

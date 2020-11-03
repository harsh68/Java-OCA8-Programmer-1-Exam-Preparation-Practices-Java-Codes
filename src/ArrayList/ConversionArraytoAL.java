/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Harsh
 */
public class ConversionArraytoAL {
    public static void main(String[] args) {
        String[] s = {"A","E","R"};
        List<String> l = Arrays.asList(s);
       // l.remove("E");
        String[] s1 =  l.toArray(new String[0]);
        s1[0] = null;
        System.out.println(l);
      //  Integer[] i ={12,12,12};
        List<Integer> list = Arrays.asList(13,14,12,12,12,12,12);
        Integer array[] = list.toArray(new Integer[4]);
        //list.add(null);
        System.out.println(list);
        
        
    }
}

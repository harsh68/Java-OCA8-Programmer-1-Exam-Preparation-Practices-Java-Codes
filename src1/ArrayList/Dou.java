/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Harsh
 */
public class Dou {
    public static void main(String[] args) {
        String names[] = {"Roel", "Jeanne", "Paul", "Mushfiq"};
        List<String> list = new ArrayList(Arrays.asList(names));//completely new list copy. 
        list.remove("Roel"); //you can modify not array dependent
        System.out.println(list);
        
            String[] s = list.toArray(new String[0]);
            System.out.println(s[1]);
        
        List<String> list2 = Arrays.asList(names);
       // list2.remove("Roel"); //cant update UnsupportedOperationException //array dependent //you can set but cant change size of list
        
        
    

        
    }
 
}

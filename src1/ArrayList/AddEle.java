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
public class AddEle {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("gh");
        l.add("yu");
        l.add(2,"rt");
        l.add(""+2);
        System.out.println(l.remove(2.2f));
        l.add(1,"hello");
        System.out.println(l);
        
        List<Integer> l1 = new ArrayList<>();
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        System.out.println(l1.remove(2));
        System.out.println(l1);
    }
}

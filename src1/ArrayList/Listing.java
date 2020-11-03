/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Harsh
 */
public class Listing {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("Abc");
        l.add(1,"END");
        l.add(2,"END");
        System.out.println(l);
        l.remove("END");
        //l.add(55, "haha");
        System.out.println(l);
        l.remove(0);
        System.out.println(l);
        l.isEmpty();
        
        List<String> l1 = new ArrayList<>();
        l1.add("Pw");
        l1.add("Pc");
        l1.add("Pb");
        l1.add("St");
        Collections.sort(l1);
        System.out.println(l1);
        StringBuilder b = new StringBuilder();
        b.append("r");
        b.append(4);
        Integer i = 6;
        System.out.println(b);
    }
}

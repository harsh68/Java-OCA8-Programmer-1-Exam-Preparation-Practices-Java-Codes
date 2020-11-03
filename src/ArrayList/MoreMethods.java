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
public class MoreMethods {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        ls.add("awe");
        ls.add("wer");
        ls.add("ewq");
        ls.add(1,"up");
        ls.add("erq");
        System.out.println(ls);
        ls.add(5,"ops");
        ls.remove("erq");
        System.out.println(ls);
        System.out.println(ls.remove(1));
        System.out.println(ls);
        ls.set(2,"edre");
        System.out.println(ls);
        ls.add("mango");
        ls.add("mango");
        ls.add("mango");
        ls.add("mango");
        System.out.println(ls);
        ls.remove("mango");
        System.out.println(ls);
        
        System.out.println(ls.get(0));
        System.out.println(ls);
        System.out.println(ls.indexOf("mangoi"));
        
        List<String> ls2 = new ArrayList<>();
        System.out.println(ls2.isEmpty());
        
        
    }
}

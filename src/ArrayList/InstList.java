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
public class InstList {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        ls.add("Hello");
        ls.add("India");
        ls.add("oedf");
        ls.add("tee");
        System.out.println(ls.remove("India"));
        System.out.println(ls);
        System.out.println(ls.remove("gawa"));
        //ls.remove(5);
        System.out.println(ls);
        
    }
   
}

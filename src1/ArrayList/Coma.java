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
public class Coma {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        List<String> ls2 = new ArrayList<>();
        System.out.println(ls==ls2);
        System.out.println(ls.equals(ls2));
        ls.add("a");
        ls2.add("a");
        System.out.println(ls==ls2);
        System.out.println(ls.equals(ls2));
        ls=ls2;
         System.out.println(ls==ls2);
        System.out.println(ls.equals(ls2));
    }
}

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
public class Rep {
    public static void main(String[] args) {
        String s = "gtttt";
        List<String> sq = new ArrayList<>();
        sq.add("rt");
        sq.add(s);
        System.out.println(sq);
        s.replace("t","o");
        System.out.println(s.replace("t","P"));
        System.out.println(sq);
        
    }
}

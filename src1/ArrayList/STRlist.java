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
public class STRlist {
    public static void main(String[] args) {
        List<String> n = new ArrayList<>();
        n.add(new String("Hello"));
        n.add(new String("Hello India"));
        n.add(new String("Hello World"));
        
        boolean b = n.contains(new String("Hello"));
        System.out.println(b);
        boolean b1 = n.contains("Hello");
        System.out.println(b1);
    }
}

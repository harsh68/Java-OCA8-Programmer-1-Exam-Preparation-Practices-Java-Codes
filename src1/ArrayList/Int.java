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
public class Int {
    public static void main(String[] args) {
        List<Integer> in =new ArrayList<>();
        in.add(101);
        in.add(0,new Integer(100));
        in.add(new Integer(200));
        in.add(new Integer(123));
        in.add(0,new Integer(100));
        in.add(new Integer(200));
        in.add(new Integer(123));
       // in.remove(100);
       in.remove(new Integer(101));
        System.out.println(in);
    }
}

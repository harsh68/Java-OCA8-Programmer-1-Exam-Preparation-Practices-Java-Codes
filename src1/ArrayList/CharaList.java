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
public class CharaList {
    public static void main(String[] args) {
        List<Character> lc = new ArrayList<Character>();
        lc.add(0,'A');
        lc.add('B');
        lc.add('2');
        System.out.println(lc.contains('B'));
        if(lc.contains('B'))
        {
            lc.remove('A'); //'A'-->65 //IndexOutOfBound Exception
        }
        System.out.println(lc);
    }
}

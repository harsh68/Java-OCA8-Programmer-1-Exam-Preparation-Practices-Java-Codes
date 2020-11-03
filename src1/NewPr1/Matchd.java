/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewPr1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Harsh
 */

class Democ
{
    int mer()
    {
        return 'a';
    }
}
public class Matchd {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        ls.add("a");
        ls.add("b");
        String[] s = new String[ls.size()];
        String[] s2 = ls.toArray(s);
        System.out.println(s[0]);
        System.out.println(s2[0]);
        s[0] = "y";
        System.out.println(s2[0]);
        
    }
}

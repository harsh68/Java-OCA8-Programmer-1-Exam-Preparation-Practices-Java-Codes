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

class der4
{
    int a =34;
    {
        int a =45;
    }
}
class DerP extends der4
{
    int a=45;
    void rft()
    {
        System.out.println("a: "+this.a);
    }
}
public class CheckTrue {
    public static void main(String[] args) {
          der4 ob = new DerP();
          int y = ((DerP)ob).a;
          System.out.println("Y:"+y);
          System.out.println(ob.a);
        
          ((DerP)ob).rft();
          System.out.println(ob.a);
       //   ob.rft();
        
        List<String> ls = new ArrayList();
        System.out.println(ls.add("ab"));
        
        List<Integer> ls2 = new ArrayList();
        System.out.println(ls2.add(4));
    }
}

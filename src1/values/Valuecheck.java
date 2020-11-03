/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package values;

/**
 *
 * @author Harsh
 */
public class Valuecheck {
    public static void main(String[] args) {
        Short s = 200;
        Integer i = 400;
        Double d = 23.23;
        Float f = 34.33f;
        Long l =  (long)s+i;
          Long l1 =  s+l;
        String s1 = i.toString();
        //String s2 =(String)(s+i);
        Double d1 = d+f;
        //Float f1 = d+f;
        Integer s2 = s+i;
      
    }
}

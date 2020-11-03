/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringFun;

/**
 *
 * @author Harsh
 */
public class Classcast {
    public static void main(String[] args) {
        
        Short s1 = 20; //s1 is reference 
        Integer i = 50; // i is reference/object
        short s = s1;
        long l = s1;
        int i1 =i;
        String s4 = i.toString();  // i is associated with Integer class
        //String s5 = i1.toString();// value dont have method
        Integer a = new Integer("2");
        Integer b = new Integer(2);
        System.out.println(a);
        if(a.equals(b))
        {
            System.out.println("Helo");
        }
          if(a==b)
        {
            System.out.println("NoNo");
        }
    }
}

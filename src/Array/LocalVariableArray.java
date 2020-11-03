/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author Harsh
 */
public class LocalVariableArray {
    String s1[] = new String[100];
    static String s2[] = new String[100];
    static String s4[];
    public static void main(String[] args) {
        String s[] = new String[100];
        String s5[];
        LocalVariableArray lv = new LocalVariableArray();
        
        System.out.println("s :"+s);
        System.out.println("s[2] :"+s[2]);
        
        //System.out.println(s5);  // not initialize
        System.out.println("s4: "+s4);
        //System.out.println(s4[2]); // Array out of bound
        
        //System.out.println(s1); //cant use non static in static
        
        lv.display();
        
        System.out.println("s2: "+s2);
        System.out.println("s2[2]: "+s2[2]);
        
        //System.out.println("s5 "+ s5[1]);  // not initialize
    }

    private void display() {
   System.out.println("s1 in method : "+s1);
   System.out.println("s1[1] in method : "+s1[1]);
    }
}

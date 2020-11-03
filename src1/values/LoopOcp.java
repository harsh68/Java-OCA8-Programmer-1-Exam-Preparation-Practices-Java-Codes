/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package values;

import java.util.ArrayList;

/**
 *
 * @author Harsh
 */
public class LoopOcp {
    public static void main(String[] args) {
           int i=0;
           i=i++;
        System.out.println(i);
        //String s =5;
        /*
        for(int i=0; i<10 ; )
         {
            i = i++;
            System.out.println("Hello World");
         }
        
*/
        ArrayList al = new ArrayList();
        al.add(34);
        ArrayList a2 = new ArrayList();
        a2.add(34);
        if(al==a2){
            System.out.println("==");
        }
        if(al.equals(a2)){
            System.out.println(".equals");
        }
        ArrayList<Integer> values = new ArrayList<>();
        values.add(34);
        System.out.println(values.remove("34"));
        System.out.println(values.equals(al));
    }
}

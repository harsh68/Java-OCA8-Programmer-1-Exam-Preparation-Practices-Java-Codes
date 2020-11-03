/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringBuilder_codes;

/**
 *
 * @author Harsh
 */
public class Sb2 {
    
public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        sb.append("pqr").reverse().insert(2, "INDIA");
        System.out.println("after operation :"+sb);
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1);
        int x =10;
        StringBuilder sb4 = new StringBuilder(x);
        System.out.println("sb4: "+sb4);
        System.out.println("sb4 capacity: "+sb4.capacity());
        StringBuilder sb5 = new StringBuilder(10);
        System.out.println("sb5: "+sb5);
        //sb5="AAAAAAAAAAAA"; //String can not converted to StringBuilder
        sb5.append("AAAAAAAAAAAA");
        System.out.println("sb5: "+sb5);
       // sb5.insert(50,"No index"); //StringIndexOutOfBound
       sb5.append(500);
        System.out.println(sb5);
        
        
    }
    
}

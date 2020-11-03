/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringFun;
import java.lang.*;
/**
 *
 * @author Harsh
 */
public class String11 {
    public static void main(String[] args) {
     String s = "Java";
     s.concat("SE 6");
     s.replace('6', '7');
     System.out.println(s);
     s +=s.concat("NEW");
        System.out.println(s);
    }
    
}

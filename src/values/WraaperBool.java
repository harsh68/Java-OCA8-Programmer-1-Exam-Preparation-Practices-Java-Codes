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
public class WraaperBool {
    public static void main(String[] args) {
        Boolean b1 = new Boolean("true");
        Boolean b2 = new Boolean(null);
        Boolean b3 = new Boolean ("TRUE");
        Boolean b4 = new Boolean ("abc");
        Boolean b5 = new Boolean ("FalsE");
        Boolean b6 = new Boolean("Tyrue");
        Boolean b7 = new Boolean("");
        Boolean b8 = new Boolean("TrUe");
        Boolean b9 = null;
        Boolean b10 = new Boolean(null);        
//Boolean b8 = new Boolean();
       
        //Boolean b9 = "abc";
        
        System.out.println(b1 +" : "+b2+" : "+b3+" : "+b4+" : "+b5+" : "+b6+" : "+b7+" : "+b8+" : "+b9+" : "+b10);
    }
}

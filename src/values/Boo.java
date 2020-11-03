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
public class Boo {
    public static void main(String[] args) {
        Boolean[] bo = new Boolean[3];
        bo[0] = new Boolean(Boolean.parseBoolean("true"));
        bo[1] = new Boolean(null);
        Boolean b = new Boolean(true);
        bo[2] = new Boolean("TrUe");
        
        System.out.println(" "+ bo[1]+ " "+bo[0]+" b: "+b+" i"+bo[2]);
    }
}

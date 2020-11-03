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
public class Checking {
    public static void main(String[] args) {
        Checking c = new Checking();
        Checking c1 = new Checking();
        if(c.equals(c1)){System.out.println("new");}
        
        char ch = 65;
        String[] s = {"Hello",null,"New"};
        System.out.println(s.length);
    }
}

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
public class Ex {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder(5);
        //String str = null;
        String str = "";
        if(s.toString().equals(str.toString()))
        {
            System.out.println("perfect");
        }
        else
        {
            System.out.println("Not");
        }
        
    }
}

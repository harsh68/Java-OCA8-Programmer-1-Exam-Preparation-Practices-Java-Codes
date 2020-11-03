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
public class FinalVV {
    public static void main(String[] args) {
        final boolean flag; //local but you can use final keyword
       // System.out.println(flag);
       final boolean flag1 = false;
         flag = false;
         //flag1 = true;
         while(flag) {
             System.out.println("Good Morning!");
         }
    }
}

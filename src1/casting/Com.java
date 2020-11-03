/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casting;

/**
 *
 * @author Harsh
 */
public class Com {
    public static void main(String[] args) {
        System.out.println(5==5.0); 
        System.out.println(5.0==5);
        System.out.println(5.0f==5);
        System.out.println(5.5==5);//false
        System.out.println(5.5==5.5f);
        System.out.println(97=='a');
        System.out.println(5.0==5L);
        System.out.println(0b1010==10.0);
        //System.out.println('a'=="a");
        System.out.println(97.0=='a');
        System.out.println(012==10);
         System.out.println(0XA==10);
        System.out.println(97.82=='a');//false
        System.out.println('a'==97.82f);//false
    }
}

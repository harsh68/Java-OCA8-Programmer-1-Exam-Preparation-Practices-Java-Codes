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
public class Confusing {
    public static void main(String[] args) {
        int a=10;
        String model;
        if(a<9)
        {
            model="first";
        }
        else if(a<=10)
        {
            model="second";
        }
        
       
        System.out.println(model); //no else part it may chance that model will not initialize 
    }
}

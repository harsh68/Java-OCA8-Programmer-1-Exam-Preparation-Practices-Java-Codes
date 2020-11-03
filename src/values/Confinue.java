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
public class Confinue {
    public static void main(String[] args) {
        for(int i = 1;i<100;)
        {
            if(i%7==0)
            {
                 i++;
                continue;
            }
            System.out.println(i+"is not  divisible by 7");
             i++;
        }
    }
}

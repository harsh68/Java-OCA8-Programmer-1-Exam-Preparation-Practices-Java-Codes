/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewPr1;

/**
 *
 * @author Harsh
 */
public class Finallt {
    final int i;
    final static int j;
    {
        i=4;
        int i = 56; //local
        System.out.println(""+i); //local
    }
    static
    {
        j=56;
       // i=45; //non static 
    }
    void chi()
    {
        //i=45; //final keyword
     }
    Finallt()
    {
        
    }
    public static void main(String[] args) {
        new Finallt();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author Harsh
 */
class Super
{
}
class Sub extends Super
{
    
}
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Super s = new Super();
        Super s1 = new Sub();
        Sub s2 = new Sub();
        Sub s3 = (Sub)new Super();
        Super s4 = (Sub)new Super();
        Super s5 =(Super)new Sub();
        //Sub s6 = (Super)new Sub();
    }
    
}

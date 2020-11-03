/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticpck;

/**
 *
 * @author Harsh
 */
class Blockclass
{
    public static void display(){
        System.out.println("Blockclass Static method");
    } 
}
public class StaticBlock {
    public static void main(String[] args) {
        Blockclass.display();
        Blockclass bc = null;
        bc.display();
        Blockclass bc1 = new Blockclass();
        bc1.display();
        Blockclass bc3; // Object must be initalize
        //bc3.display();

    }
    
}

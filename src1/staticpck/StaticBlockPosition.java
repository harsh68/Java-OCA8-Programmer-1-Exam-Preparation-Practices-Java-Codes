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
class Position
{
    //String n = "Hellow";
    {
        n = "yello";
       // System.out.println(n);// You can’t refer to a variable before it has been initialized:
    }
    String n = "Hellow";
    Position()
    {
        //anyrhing
    }
}
public class StaticBlockPosition {
    public static void main(String[] args) {
        Position p = new Position();
        System.out.println("Print value: "+ p.n);
        float f = 5;
        //int a = 4.4; //compile time error
        double d = 0XE;
        float f1 = 0XAE;
        float e3 = 0b1101;
        double d2 = 0b1101;
    }
}

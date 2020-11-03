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
class Bird
{
    static
    {
        System.out.println("r1");
    }
    {
        System.out.println("b1");
    }
}
public class Hawk {
    public static void main(String[] args) {
        System.out.println("pre");
        new Bird();
        System.out.println("hawk");
    }
}

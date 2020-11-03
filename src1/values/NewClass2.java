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
class Beta1{}
class Alpha1
{
    static Beta1 b1;
}
public class NewClass2 {
    public static void main(String[] args) {
        Alpha1 a1 = new Alpha1();
        Alpha1 a2 = new Alpha1();
        a1 = new Alpha1();
    }
}

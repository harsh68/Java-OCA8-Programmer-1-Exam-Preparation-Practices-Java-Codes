/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception_details;

/**
 *
 * @author Harsh
 */
/*


in static method you can only call direct static method otherwise you need to use Object
*/
public class CheckMethodCall {
    public static void main(String[] args) {
        new CheckMethodCall().s1();
        String s = null;
        System.out.println(s.toLowerCase());
        
    }
    void s1()
    {
        s2();
    }
    void s2()
    {
        
    }
}

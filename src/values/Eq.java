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
class Break
{
    int a;
}
public class Eq {
    public static void main(String[] args) {
        
         Break b1 = new Break();
         Break b2 = new Break();
         Break b3 = new Break();
         System.out.println(b1.equals(b2));
         b1.a = 5;
         b2.a = 5;
         System.out.println(b1.equals(b2));
         b1=b2;
         System.out.println(b1.equals(b2));
         b2.a=12;
         b1.a =15;
         System.out.println(b1.equals(b2));
    }
    
}

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
class Dert1
{
    int a;
}
public class Desny {
    public static void main(String[] args) {
        Dert1 d = new Dert1();
        Dert1 d1 = new Dert1();
        if(d.equals(d1)){System.out.println("magic");}
        d=d1;
        if(d.equals(d1)){System.out.println("expected");}
        
    }
}

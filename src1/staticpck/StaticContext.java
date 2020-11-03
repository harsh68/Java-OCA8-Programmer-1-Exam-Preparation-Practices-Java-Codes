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
public class StaticContext {
  static int static_var = 0;
    public StaticContext() {
        static_var++;
    }
    
    public static void main(String[] args) {
        new StaticContext();
        new StaticContext();
        new StaticContext();
        System.out.println(static_var);
    }
}

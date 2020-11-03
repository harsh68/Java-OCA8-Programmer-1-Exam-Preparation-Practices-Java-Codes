/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Harsh
 */
interface I11
{
    int a = 56;  //by default public static final
    //default methods cannot be marked as private, protected, static, final, or abstract.
    
    //static interface methods cannot be marked as private, protected, final, or abstract.
    
    //When invoking a static interface method, the method’s type (interface name) MUST be included in the invocation.
}
public class FinalVar implements I11 {
    public static void main(String[] args) {
        //I11 ob =  new FinalVar();
        
        System.out.println("a:"+a);
    }
}

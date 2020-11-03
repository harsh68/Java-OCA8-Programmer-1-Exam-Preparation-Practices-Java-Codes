/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package values;
import java.util.Arrays;
/**
 *
 * @author Harsh
 */
interface F6
{
    
}
class A6 implements F6
{
    
}
class B6 extends A6
{
    
}
public class In6 {
    public static void main(String[] args) {
        B6 ob = new B6();
        System.out.println(ob instanceof A6);
        System.out.println(ob instanceof F6);
        F6 f1 = new B6();
        System.out.println(f1 instanceof A6);
        System.out.println(f1 instanceof B6);
        System.out.println(f1 instanceof F6);
        
        F6 f2 = new A6();
        System.out.println(f2 instanceof A6);
        System.out.println(f2 instanceof B6); //false
        System.out.println(f2 instanceof F6);
        
        String s = null;
        System.out.println(s instanceof String);
        System.out.println(null instanceof String);
        System.out.println(s instanceof Object);
        
        int []nums = new int[3];
        System.out.println(nums instanceof Object);
       // System.out.println(nums instanceof Arrays);
        
    }
}

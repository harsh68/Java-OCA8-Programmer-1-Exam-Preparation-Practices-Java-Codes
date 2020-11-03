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
class Test1 { 
   int i = 10; 
} 
public class Test22 { 
    public static void main(String args[])
 { 
         
          Test1 t1 = new Test1();
         t1.i = 30;  // Works
         t1.i =45;  // Works
        System.out.println(t1.i);
    } 
}

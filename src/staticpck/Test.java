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
class Test { 
    static int i; 
    int j; 
      
    // start of static block  
    static { 
        i = 10; 
        news();
        System.out.println("static block called "); 
    } 
    // end of static block  
   static void news()
    {
        System.out.println("method");
    }
   public static void main(String args[]) { 
  
        // Although we don't have an object of Test, static block is  
        // called because i is being accessed in following statement. 
        //System.out.println(Test.i);  
    }
} 

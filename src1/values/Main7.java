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
class Test { 
    {
      j =45;    
    }
     {
        j = 10;
    }
    static int i; 
    int j=90; 
        static
        { 
        i = 10; 
        System.out.println("static block called "); 
       }
    
} 
  
class Main7 { 
    public static void main(String args[]) { 
  
        System.out.println(Test.i);  
        System.out.println(" "+new Test().j);
    } 
} 
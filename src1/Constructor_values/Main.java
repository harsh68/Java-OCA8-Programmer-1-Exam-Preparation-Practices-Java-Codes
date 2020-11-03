/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// application for create only single object of a class
package Constructor_values;

/**
 *
 * @author Harsh
 */
class MySingleton 
{ 
    static MySingleton instance = null; 
    public int x = 10; 
    
    // private constructor can't be accessed outside the class 
    private MySingleton() {  } 
   
    // Factory method to provide the users with instances 
    static public MySingleton getInstance() 
    { 
        if (instance == null)         
             instance = new MySingleton(); //class itself can instantiate an object of that type
   
        return instance; 
    }  
} 
  /*if the private constructor class wants to allow an instance of the class to be used,
the class must provide a static method or variable that allows access to an instance created from within the class*/
// Driver Class 
class Main 
{ 
   public static void main(String args[])     
   { 
       MySingleton a = MySingleton.getInstance(); //static method to create object
       MySingleton b = MySingleton.getInstance(); 
       a.x = a.x + 10; 
       System.out.println("Value of a.x = " + a.x); 
       System.out.println("Value of b.x = " + b.x); 
       if(a==b){System.out.println("same reference");}
       System.out.println(a);
       System.out.println(b);
   }     
}
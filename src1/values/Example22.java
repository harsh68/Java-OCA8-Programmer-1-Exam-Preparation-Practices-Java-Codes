/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package values;

interface MyInterface1{  
 
    default void newMethod(){  
        System.out.println("Newly added default method");  
    }  
    void existingMethod(String str);  
}  
interface MyInterface2{  
	 

    default void newMethod(){  
        System.out.println("Newly added default method");  
    }  
    void disp(String str);  
} 
public class Example22 implements MyInterface1, MyInterface2{ 
	// implementing abstract methods
    @Override
    public void existingMethod(String str){           
        System.out.println("String is: "+str);  
    }  
    @Override
    public void disp(String str){
    	System.out.println("String is: "+str); 
    }
    
    @Override 
    public void newMethod()
    {
        System.out.println("P");
    }
    
    
    public static void main(String[] args) {  
    	Example22 obj = new Example22();
    	
    	//calling the default method of interface
        obj.newMethod();     
  
  
    }  
}
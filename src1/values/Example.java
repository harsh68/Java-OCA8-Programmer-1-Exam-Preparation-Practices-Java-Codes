package values;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
interface MyInterface{  
    /* This is a default method so we need not
     * to implement this method in the implementation 
     * classes  
     */
    default void newMethod(){  
        System.out.println("Newly added default method");  
    }  
   
    static void anotherNewMethod(){
    	System.out.println("Newly added static method");
    }
    void existingMethod(String str);  
}  

public class Example implements MyInterface{ 
	// implementing abstract method
    public void existingMethod(String str){           
        System.out.println("String is: "+str);  
    }
    @Override
    public void newMethod(){  
        System.out.println("Newly added in Exapmle");  
    }  
   
    public static void main(String[] args) {  
    	Example obj = new Example();
    	
    	//calling the default method of interface
        obj.newMethod(); 
        //calling the static method of interface
        MyInterface.anotherNewMethod();
        //calling the abstract method of interface
        obj.existingMethod("Java 8 is easy to learn"); 
    }  
}

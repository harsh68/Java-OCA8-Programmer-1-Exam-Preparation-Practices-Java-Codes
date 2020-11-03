/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author Harsh
 */
class Demo { 
    public void show(double x) 
    { 
        System.out.println("In int" + x); 
    } 
    public void show(String s) 
    { 
        System.out.println("In String" + s); 
    } 
    public void show(byte b) 
    { 
        System.out.println("In byte" + b); 
    } 
} 
class UseDemo { 
    public static void main(String[] args) 
    { 
        byte a = 25; 
        Demo obj = new Demo(); 
        obj.show(a); // it will go to 
        // byte argument 
        obj.show("hello"); // String 
        obj.show(250); // Int 
        obj.show('A'); // Since char is 
        // not available, so the datatype 
        // higher than char in terms of 
        // range is int. 
        obj.show("A"); // String 
        obj.show(7.5);
        // since float datatype 
// is not available and so it's higher 
// datatype, so at this step their 
// will be an error. 
    }
}
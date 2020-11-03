/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;
/**
 *
 * @author Harsh Example of upcasting
 * Methods can be override 
 * In Java, we can override methods only, not the variables(data members),
 * so runtime polymorphism cannot be achieved by data members.
 * i can only call orriden method but not variable.( not data memeber only method)
 * 
 */
class A 
{ 
    int x =10;
    void m1() 
    { 
        System.out.println("Inside A's m1 method"); 
    } 
} 
  
class B extends A 
{ 
    // overriding m1()
    int x =20;
    @Override
    void m1() 
    { 
        System.out.println("Inside B's m1 method"); 
    } 
} 
  
class C extends A 
{ 
    // overriding m1()
    int x =30;
    @Override
    void m1() 
    { 
        System.out.println("Inside C's m1 method"); 
    } 
} 
  
// Driver class 
class Dispatch 
{ 
    public static void main(String args[]) 
    { 
        // object of type A 
        A a = new A(); 
  
        // object of type B 
        B b = new B(); 
  
        // object of type C 
        C c = new C(); 
  
        
        System.out.println("Actual Object calling from A a (a.m1)");
        a.m1();
        System.out.println("Actual Object calling from B b (b.m1)");
        b.m1();
        System.out.println("Actual Object calling from C c (c.m1)");
        c.m1();
        // obtain a reference of type A 
        A ref; 
          
        // ref refers to an A object 
        ref = a; 
  
        // calling A's version of m1() 
        ref.m1();
        System.out.println("value of x:"+ref.x);
  
        // now ref refers to a B object 
        ref = b; 
  
        // calling B's version of m1() 
        ref.m1(); 
        System.out.println("value of x:"+ref.x);
        // now ref refers to a C object 
        ref = c; 
  
        // calling C's version of m1() 
        ref.m1();
        System.out.println("value of x:"+ref.x);
    } 
} 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overriding;

/**
 *
 * @author Harsh
 */
class A {
     public void print() {
         System.out.println("A");
     }
}


//B.java

 
 class B extends A {
     public void print() {
         System.out.println("B");
     }
}


//C.java

 
 class C extends A {
     public void print() {
         System.out.println("C");
     }
}


//Test.java

 
public class Test {
     public static void main(String[] args) {
         A obj1 = new C();
         A obj2 = new B();
         //if-->B obj2 = new B(); its compile time mistake on line 48
         C obj3 = (C)obj1;
         C obj4 = (C)obj2;
         obj3.print();
     }
}

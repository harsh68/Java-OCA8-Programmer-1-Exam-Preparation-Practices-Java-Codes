/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;

/**
 *
 * @author Harsh
 */
class A1 {}
class B1 extends A1 {}
class C1 extends A1 {}
public class Q3ae4 {
public static void main(String[] args) {
A1 x = new A1();
B1 y = new B1();
C1 z = new C1();
// (1) INSERT CODE HERE.
y = (B1) x; //Runttime Exception
z = (C1) y;
y = (A1) y;
}
}

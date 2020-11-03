/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewPr1;

/**
 *
 * @author Harsh
 */
public class Qcb90 {
private int a;
private int b;
public void f() {
a = 0;
b = 0;
int[] c = { 0 };
g(b, c);
System.out.println(a + " " + b + " " + c[0] + " ");
}
public void g(int b, int[] c) {
a = 1;
b = 1;
c[0] = 1;
}
public static void main(String[] args) {
Qcb90 obj = new Qcb90();
obj.f();
}}
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
class MyClass {
static MyClass ref;
String[] arguments;
static int a;
void dis(MyClass ob)
{
    ref = ob;
    a=2;
}
public static void main(String[] args) {
ref = new MyClass();
ref.func(args);
}
public void func(String[] args) {
ref.arguments = args;
}
}
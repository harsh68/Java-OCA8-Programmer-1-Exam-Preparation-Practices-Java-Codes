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
class Z {
    static int peek() { return j; }
    static int i = peek();
    static int j = 1;
}
class Test2 {
    Test2() { k = 2; }
    int j = 1;
    int i = j;
    int k;
}
class Test {
    public static void main(String[] args) {
        System.out.println(Z.i);
        System.out.println(Z.j);
        System.out.println(Z.i);//because the variable initializer for i uses the class method peek to access the value of the variable j before j has been initialized by its variable initializer, at which point it still has its default value 
     Test2 t = new Test2();
        System.out.println(t.i);
    }
}
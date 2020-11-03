/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticpck;

/**
 *
 * @author Harsh
 */
public class NewClass {
    NewClass(){}
    NewClass(NewClass n1){
        m1 = n1;
    }
    NewClass m1;
    public static void main(String[] args) {
    NewClass m2 = new NewClass();
    NewClass m3 =m2;
    m3.go();
        NewClass m5 = new NewClass(m3);
    m5.go();
    NewClass m4 = m3.m1;
    m4.go();

}

    private void go() {
        System.out.println("hi");
    }
   
}

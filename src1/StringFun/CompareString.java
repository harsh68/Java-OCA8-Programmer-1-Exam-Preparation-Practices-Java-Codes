/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringFun;

/**
 *
 * @author Harsh
 */
public class CompareString {
    public static void main(String[] args) {
        String s = new String("Hello"); //in Heap Area
        String s1 = "Hello";//in String Constant Pool area
        String s2 = "Hello";//in String Constant Pool area
        if(s==s1)
        {
            System.out.println("Same result");
        }
        if(s1==s2)
        {
            System.out.println("Same String Refer");
        }
    }
}

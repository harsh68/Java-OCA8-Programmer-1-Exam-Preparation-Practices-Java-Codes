/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casting;

/**
 *
 * @author Harsh
 */
public class Inf {
    public static void main(String[] args) {
        int a =10,b;
        float c=12.32f,d,g;
        b = (int) c; // int to float explicit
        d = a; // implicit conversion float
        double e=34.32323,f;
        f=c; // float to double implicit
        g = (float) e; // double to float explicit type con.   
    }
}

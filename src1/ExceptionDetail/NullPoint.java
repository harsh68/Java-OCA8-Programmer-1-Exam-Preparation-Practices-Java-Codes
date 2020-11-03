/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionDetail;

/**
 *
 * @author Harsh
 */
public class NullPoint {
    public static int[] arr;
    public void dis1()
    {
        System.out.println("");
    }
    public static void main(String[] args) {
        System.out.println(arr);
       int[] arr1=null;
        System.out.println(arr1);
        NullPoint nc = null;
        nc.dis1();
    }
}
